import java.util.Scanner;

public class SumOfPositiveOddNumbers {
    public static int sumPositiveOdd(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        int currentSum = (arr[index] > 0 && arr[index] % 2 != 0) ? arr[index] : 0;
        return currentSum + sumPositiveOdd(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sumPositiveOdd(arr, 0);
        System.out.println("Sum of positive odd numbers: " + sum);
        sc.close();
    }
}
