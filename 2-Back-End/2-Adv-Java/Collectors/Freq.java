import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter no.of integers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter integer " + i + ": ");
            int variable = sc.nextInt();
            al.add(variable);
        }
        Map<Integer, Long> frequencyMap = al.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("Integer and its frequency in a map: " + frequencyMap);
        sc.close();
    }
}
