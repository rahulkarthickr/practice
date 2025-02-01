import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter array elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int j = 0; j < num; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        int temp = max;
        int dummy = -1;
        System.out.println("First Largest element in the array:" + max);
        for (int k = 0; k < num; k++) {
            if (dummy < arr[k] && temp > arr[k]) {
                dummy = arr[k];
            }
        }
        System.out.println("Second Largest element in  the array:" + dummy);
        sc.close();
    }
}