import java.util.HashMap;
import java.util.Scanner;

public class CheckNAndItsDoubleExist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean Exist = checkIfExist(arr);
        System.out.println(Exist);
        sc.close();
    }

    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(2 * arr[i]) && i != map.get(2 * arr[i])) {
                return true;
            }
        }
        return false;
    }
}