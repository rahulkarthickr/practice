import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter the size of list " + i + ": ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the price of product " + (j + 1) + " for list " + i + ": ");
                arr[j] = sc.nextInt();
            }
            for (int k = 0; k < n; k++) {
                al.add(arr[k]);
            }
        }
        System.out.println("Merged Lists: " + al);
        sc.close();
    }
}
