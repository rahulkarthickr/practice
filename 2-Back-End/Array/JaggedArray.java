import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int num = sc.nextInt();
        int col_len = 0;
        int[][] arr = new int[num][];
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Enter column length:");
            col_len = sc.nextInt();
            arr[j] = new int[col_len];
            for (int k = 0; k < arr[j].length; k++) {
                System.err.println("Enter the element:");
                arr[j][k] = sc.nextInt();
            }
        }
        System.out.println("Array elements:" + Arrays.deepToString(arr));
        sc.close();
    }
}
