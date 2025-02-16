import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] sorted = sortArray(nums);
        System.out.println(Arrays.toString(sorted));
        sc.close();
    }

    public static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
