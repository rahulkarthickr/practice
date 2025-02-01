import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] rotation = rotate(arr);
        for (int k = 0; k < arr.length; k++) {
            for (int l = k + 1; l < arr.length; l++) {
                System.out.print(rotation[k][l] + " ");
            }
        }
        sc.close();
    }

    public static int[][] rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols - 1 - j];
                matrix[i][cols - 1 - j] = temp;
            }
        }
        return matrix;
    }
}
