import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{name= '" + name + "' , age= " + age + " }";
    }
}

public class EmployeeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of employees: ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();
        BiFunction<String, Integer, Employee> employeeConstructor = Employee::new;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name: ");
            String emp = sc.nextLine();
            System.out.println("Enter employee age: ");
            int age = sc.nextInt();
            employees.add(employeeConstructor.apply(emp, age));
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        sc.close();
    }
}
