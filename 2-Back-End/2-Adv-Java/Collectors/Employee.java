import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employee {
    public String name;
    public int age;
    public int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        System.out.println("Enter the no.of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the employee name: ");
            String name = sc.nextLine();
            System.out.println("Enter the employee age: ");
            int age = sc.nextInt();
            System.out.println("Enter the employee salary: ");
            int salary = sc.nextInt();
            sc.nextLine();
            list.add(new Employee(name, age, salary));
        }
        System.out.println("Average salary of employees who are older than 30: "
                + list.stream().filter(emp -> emp.age > 30).collect(Collectors.averagingDouble(emp -> emp.salary)));
        sc.close();
    }
}
