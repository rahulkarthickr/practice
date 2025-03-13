import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int sum = 0;
        int[] arr = new int[num];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        System.out.println("Sum of elements of the array:" + sum);
        sc.close();
    }
}
