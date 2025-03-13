import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int sum = sc.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == sum) {
                System.out.println("(" + arr[i] + "," + arr[i + 1] + ")");
            }
        }
        sc.close();
    }
}
