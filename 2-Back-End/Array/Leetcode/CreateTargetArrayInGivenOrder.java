import java.util.Scanner;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        int[] index = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int j = 0; j < index.length; j++) {
            index[j] = sc.nextInt();
        }
        int[] result = createTargetArray(nums, index);
        for (int val : result) {
            System.out.println(val + " ");
        }
        sc.close();
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i > index[i]) {
                shiftRight(ans, index[i], i);
            }
            ans[index[i]] = nums[i];
        }
        return ans;
    }

    public static void shiftRight(int[] arr, int pos, int length) {
        for (int i = length; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
    }
}
