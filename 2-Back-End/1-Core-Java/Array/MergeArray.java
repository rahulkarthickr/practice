import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of array2:");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Enter the array1 elements:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the array2 elements:");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }
        mergeArrays(arr1, arr2);
        sc.close();
    }

    public static void mergeArrays(int[] a, int[] b) {
        int length1 = a.length;
        int length2 = b.length;
        int i = 0, j = 0, k = 0;
        int[] merged = new int[length1 + length2];
        while (i < length1 && j < length2) {
            if (a[i] < b[i]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }
        while (i < length1) {
            merged[k++] = a[i++];
        }
        while (j < length2) {
            merged[k++] = b[j++];
        }
        for (int l = 0; l < length1; l++) {
            a[l] = merged[l];
        }
        for (int m = 0; m < length2; m++) {
            b[m] = merged[length1 + m];
        }
        System.out.println("Sorted Arrays:");
        System.out.println("Array1:" + Arrays.toString(a));
        System.out.println("Array2:" + Arrays.toString(b));
    }
}
