import java.util.HashSet;
import java.util.Scanner;

public class UniqueAndDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();
        for (int num : arr) {
            // If num is already in uniqueSet, add(num) returns false,
            // Then duplicate number is added to duplicateSet.
            if (!uniqueSet.add(num)) {
                duplicateSet.add(num);
            }
        }
        uniqueSet.removeAll(duplicateSet);
        System.out.println("Unique elements: " + uniqueSet);
        System.out.println("Duplicate elements: " + duplicateSet);
        sc.close();
    }
}
