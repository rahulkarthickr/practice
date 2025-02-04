import java.util.Arrays;
import java.util.Scanner;

public class Rearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int num = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1; j++) {
            if (j % 2 == 1 && arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("Rearranged Array:" + Arrays.toString(arr));
        sc.close();
    }
}