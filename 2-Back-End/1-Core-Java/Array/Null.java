import java.util.Scanner;

public class Null {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];
        System.out.println(arr[0]); // This will print 'null' as O/P
        // Null is a special literal of 'null' type, this same as 'none' in Python
        // we can assign any type to 'null' and typecast it to any type as well
        // but we can't declare it
        sc.close();
    }
}
