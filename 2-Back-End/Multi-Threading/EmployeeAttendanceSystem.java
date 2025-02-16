import java.util.Scanner;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        // 6. Everytime assigning values, name of the employee is printed
        System.out.println("Employee name: " + name);
        // 7. Checks if name is alphabetic or not
        if (!name.matches("[A-Za-z ]+")) {
            throw new IllegalArgumentException("Invalid employee name: " + name);
        }
        this.id = id;
        this.name = name.trim();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - " + name;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if both objects refer to the same memory location
        // this refers to employees[i] (existing employee) object
        // obj refers to newEmployee object
        if (this == obj) {
            return true;
        }
        // Check if obj is null or belongs to a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Typecsting newEmployee object to Employee class
        // And asssigning it to emp object
        Employee emp = (Employee) obj;
        // Checks if private id and name equals to emp object values
        // Returns true if both are same otherwise returns false
        return id == emp.id && name.equals(emp.name);
    }
}

class Attendance {
    private Employee[] employees;
    private int employeeCount;
    private String[] attendanceRecords;
    private int recordCount;

    public Attendance(int employeeSize) {
        this.employees = new Employee[employeeSize];
        this.employeeCount = 0;
        this.attendanceRecords = new String[employeeSize];
        this.recordCount = 0;
    }

    public synchronized void addEmployee(int id, String name) {
        // 5. Assigning values to the newEmployee object using constructor
        Employee newEmployee = new Employee(id, name);
        // 8. Checks for duplicate values
        for (int i = 0; i < employeeCount; i++) {
            // Calls the overrided equals() if existing employee[i] matches the newEmployee
            if (employees[i].equals(newEmployee)) {
                throw new IllegalArgumentException("Duplicate entry: Employee ID " + id + " already exists");
            }
        }
        // 9. Checks if employees list is full or not
        if (employeeCount >= employees.length) {
            System.out.println("Error: Employee list is full");
            return;
        }
        // 10. Assigning newEmployee values to employees object array
        employees[employeeCount++] = newEmployee;
    }

    public synchronized void markAttendance(int id, String status) {
        // 16. Declare a variable to hold the employee reference
        Employee emp = null;
        // 17. Iterating through employees array to find the employee with given id
        for (int j = 0; j < employeeCount; j++) {
            // 18. If a matching employee is found, store the reference and exit the loop
            if (employees[j].getId() == id) {
                emp = employees[j];
                break;
            }
        }
        // 19. If no employee with given id is found, print the error and return
        if (emp == null) {
            System.out.println("Error: Employee ID " + id + " not found");
            return;
        }
        status = status.toUpperCase();
        // 20. Checks if the status is valid (PRESENT, ABSENT, or LATE)
        if (!status.equals("PRESENT") && !status.equals("ABSENT") && !status.equals("LATE")) {
            System.out.println("Error: Invalid attendance status for ID " + id);
            return;
        }
        // 21. Checks if the attendanceRecords array has space for a new record or not
        if (recordCount >= attendanceRecords.length) {
            System.out.println("Error: Attendance records are full!");
            return;
        }
        // 22. When emp object is used in a string operation (like concatenation with "
        // - " + status), Java automatically calls toString() on the emp object
        // toString() method formats the emp object as "ID: <id> - <name>"
        // This is done to store emp and status together as a string
        attendanceRecords[recordCount++] = emp + " - " + status;
        // 23. Print the success message indicating that attendance was marked
        System.out.println("Attendance Marked: " + emp + " - " + status);
    }

    // 25. Displays all the attendanceRecords array values
    public void displayAttendanceRecords() {
        System.out.println("- - - Attendance Records - - -");
        for (int i = 0; i < recordCount; i++) {
            System.out.println(attendanceRecords[i]);
        }
    }

    public Employee getEmployee(int index) {
        return (index < employeeCount) ? employees[index] : null;
    }
}

class AttendanceThread extends Thread {
    private Attendance attendance;
    private int id;
    private String status;

    public AttendanceThread(Attendance attendance, int id, String status) {
        this.attendance = attendance;
        this.id = id;
        this.status = status;
    }

    @Override
    // 15. run() method calls markAttendance method
    public void run() {
        attendance.markAttendance(id, status);
    }
}

public class EmployeeAttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeSize = 0;
        // 1. Getting the number of employees
        while (true) {
            try {
                System.out.println("Enter the number of employees:");
                employeeSize = sc.nextInt();
                sc.nextLine();
                if (employeeSize > 0)
                    break;
                System.out.println("Please enter a positive integer.");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer");
                sc.nextLine();
            }
        }
        // 2. Creating object for creation of object arrays according to given size
        // This object is also used for accessing methods of Attendance class
        Attendance attendanceSystem = new Attendance(employeeSize);
        // 3. Getting id and name for every employee
        for (int i = 0; i < employeeSize; i++) {
            int id;
            while (true) {
                try {
                    System.out.println("Enter the employee ID:");
                    id = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid ID");
                    sc.nextLine();
                }
            }
            System.out.println("Enter the name of employee");
            String name = sc.nextLine();
            // 4. Passing employee id and name values to addEmployee method
            try {
                attendanceSystem.addEmployee(id, name);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
        for (int j = 0; j < employeeSize; j++) {
            // 11. Everytime the loops runs, employee array values are assigned to emp
            // Array values are taken based on index that is verified using getEmployee
            Employee emp = attendanceSystem.getEmployee(j);
            if (emp != null) {
                // 12. Getting status for every employee
                System.out.println("Enter attendance status for " + emp.getName() + " (PRESENT/ABSENT/LATE):");
                String status = sc.nextLine();
                // 13. Everytime loop runs, thread is created newly and
                // values are assigned to AttendanceThread class using constructor
                Thread t = new Thread(new AttendanceThread(attendanceSystem, emp.getId(), status));
                // 14. After thread creation, the thread is started using run() method
                t.start();
                try {
                    t.join();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        // 24. Calls displayAttendanceRecords method
        attendanceSystem.displayAttendanceRecords();
        sc.close();
    }
}