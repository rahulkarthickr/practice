import java.util.ArrayList;
import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        int target = sc.nextInt();
        int index = searchInsert(nums, target);
        System.out.println(index);
        sc.close();
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == target) {
                index = j;
            }
        }
        for (int k = 0; k < temp.size(); k++) {
            if (target > temp.get(k)) {
                index = k + 1;
            }
        }
        return index;
    }
}
