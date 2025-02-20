import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isDuplicate = containsDuplicate(arr);
        System.out.println(isDuplicate);
        sc.close();
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                return true;
            }
            map.put(i, true);
        }
        return false;
    }
}
