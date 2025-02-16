import java.util.Arrays;
import java.util.Scanner;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[sc.nextInt()];
        int[] num2 = new int[sc.nextInt()];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = sc.nextInt();
        }
        for (int j = 0; j < num2.length; j++) {
            num2[j] = sc.nextInt();
        }
        double median = findMedianSortedArrays(num1, num2);
        System.out.println(median);
        sc.close();
    }

    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        double median = 0;
        int[] ans = new int[num1.length + num2.length];
        for (int i = 0; i < num1.length; i++) {
            ans[i] = num1[i];
        }
        for (int j = 0; j < num2.length; j++) {
            ans[num1.length + j] = num2[j];
        }
        Arrays.sort(ans);
        if (ans.length % 2 != 0) {
            median = ans[(ans.length / 2)];
        } else {
            median = (ans[(ans.length / 2) - 1] + ans[(ans.length / 2)]) / 2.0;
        }
        return median;
    }
}
