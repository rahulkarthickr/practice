import java.util.Scanner;

public class AscDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int mid = num / 2;
        for (int j = 0; j < mid - 1; j++) {
            for (int k = j + 1; k < mid; k++) {
                if (arr[j] > arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for (int l = mid; l < num - 1; l++) {
            for (int m = l + 1; m < num; m++) {
                if (arr[l] < arr[m]) {
                    int temp = arr[l];
                    arr[l] = arr[m];
                    arr[m] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        sc.close();
    }
}
