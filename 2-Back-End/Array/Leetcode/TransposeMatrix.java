import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] nums = transpose(arr);
        for (int k = 0; k < nums.length; k++) {
            for (int l = k + 1; l < nums.length; l++) {
                System.out.print(nums[k][l] + " ");
            }
        }
        sc.close();
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
}
