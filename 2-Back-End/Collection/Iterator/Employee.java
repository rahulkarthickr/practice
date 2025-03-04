import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
    int id;
    String name;
    int salary;
    String job;

    Employee(int id, String name, int salary, String job) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.job = job;
    }

    static void addEmployee(ArrayList<Employee> employees, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter ID:");
            int id = sc.nextInt();
            System.out.println("Enter salary:");
            int sal = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter job:");
            String job = sc.nextLine();
            employees.add(new Employee(id, name, sal, job));
        }
    }

    static void displayEmployee(ArrayList<Employee> employees) {
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            System.out.println("Name:" + emp.name);
            System.out.println("Salary:" + emp.salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Employee> employees = new ArrayList<>();
        addEmployee(employees, n, sc);
        displayEmployee(employees);
    }
}
