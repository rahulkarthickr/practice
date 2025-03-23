import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Name {
    public String name;
    public int age;
    public int salary;
    public String deprt;

    Name(String name, int age, int salary, String deprt) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.deprt = deprt;
    }

    public String toString() {
        return String.format("Name: %s, Age: %d, Salary: %d, Department: %s", name, age, salary, deprt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Name> list = new ArrayList<>();
        System.out.println("Enter the no.of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the employee name: ");
            String name = sc.nextLine();
            System.out.println("Enter the employee age: ");
            int age = sc.nextInt();
            System.out.println("Enter the employee salary: ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the department: ");
            String deprt = sc.nextLine();
            list.add(new Name(name, age, salary, deprt));
        }
        System.out.println("Employee Names: " + list.stream().collect(Collectors.groupingBy(k -> k.name)));
        sc.close();
    }
}
