import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            System.err.println("Enter side " + i + " length: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("The type of triangle according to given length: " + triangleType(nums));
        sc.close();
    }

    public static String triangleType(int[] nums) {
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                result = "equilateral";
            } else if (nums[0] + nums[1] > nums[2] && nums[1] + nums[2] > nums[0] && nums[0] + nums[2] > nums[1]) {
                if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                    result = "isosceles";
                } else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]) {
                    result = "scalene";
                }
            } else {
                result = "none";
            }
        }
        return result;
    }
}
