import java.util.Scanner;

public class CountOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for the array:");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Count of pairs whose sum is even: 0");
            sc.close();
            return;
        }
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] + arr[i + 1]) % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of pairs whose sum is even:" + count);
        sc.close();
    }
}
