import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        List<String> names = Arrays.asList(arr);
        names.sort(String::compareToIgnoreCase);
        System.out.println("Sorted List: " + names);
        sc.close();
    }
}
