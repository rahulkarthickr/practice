import java.util.HashSet;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        HashSet<Integer> seq = new HashSet<>();
        for (int num : set) {
            if (set.contains(num + 1)) {
                seq.add(num);
                seq.add(num + 1);
            }
        }
        System.out.println("Sequence:" + seq);
        System.out.println("Count of Sequence:" + seq.size());
        sc.close();
    }
}
