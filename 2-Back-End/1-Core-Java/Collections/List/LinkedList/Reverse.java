import java.util.LinkedList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> li = new LinkedList<>();
        LinkedList<Integer> link = new LinkedList<>();
        System.out.print("Enter no.of inputs: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }
        for (int j = li.size() - 1; j >= 0; j--) {
            link.add(li.get(j));
        }
        sc.close();
    }
}
