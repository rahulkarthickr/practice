import java.util.Scanner;

public class TwoSum {
    public static void main(String[] arsg) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println(" " + result[0] + " " + result[1]);
        }
        sc.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
