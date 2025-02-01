import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = buildArray(nums);
        for (int val : result) {
            System.out.print(val + " ");
        }
        sc.close();
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0 && nums[i] < nums.length) {
                ans[i] = nums[nums[i]];
            } else {
                System.out.println("Index out of bounds: " + nums[i]);
                ans[i] = -1;
            }
        }
        return ans;
    }
}
