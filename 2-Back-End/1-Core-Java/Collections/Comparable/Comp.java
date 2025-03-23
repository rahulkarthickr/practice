import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Comp implements Comparable<Comp> {

    Integer id;
    String name;

    Comp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    public int compareTo(Comp a) {
        return id.compareTo(a.id);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Comp> al = new ArrayList<>();
        System.out.println("Enter the list size: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter name: ");
            String str = sc.nextLine();
            System.out.println("Enter the ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            al.add(new Comp(id, str));
        }
        // Collections.sort() automatically calls compareTo()
        // This happens because the ArrayList 'al' implements Comparable interface
        // compareTo() helps decide the sorting order
        // The sorting process continues until the list is fully sorted
        Collections.sort(al);
        System.out.println("Sorted Arraylist after comparison: " + al);
        sc.close();
    }
}
