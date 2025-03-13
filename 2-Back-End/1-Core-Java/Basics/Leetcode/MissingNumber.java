import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int missing = missingNumber(arr);
        System.out.println(missing);
        sc.close();
    }

    public static int missingNumber(int[] nums) {
        int missing = 0;
        int sum = 0;
        int sum_nums = (nums.length * (nums.length + 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        missing = sum_nums - sum;
        return missing;
    }
}
