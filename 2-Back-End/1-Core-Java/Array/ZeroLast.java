import java.util.Scanner;

public class ZeroLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }
        while (index < n) {
            array[index] = 0;
            index++;
        }
        System.out.print("Array after moving zeros to the end: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
