import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    Integer salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.salary, e2.salary);
    }
}

public class Comp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> al = new ArrayList<>();
        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee name:");
            String name = sc.nextLine();
            System.out.println("Enter employee salary:");
            int salary = sc.nextInt();
            al.add(new Employee(id, name, salary));
        }
        System.out.println("Original List: " + al);
        Collections.sort(al, new NameComparator());
        System.out.println("Sorted by Name: " + al);
        Collections.sort(al, new SalaryComparator());
        System.out.println("Sorted by Salary: " + al);
        sc.close();
    }
}
