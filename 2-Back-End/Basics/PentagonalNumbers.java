import java.util.Scanner;

public class PentagonalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of pentagonal numbers:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int pentagonal = i * ((3 * i) - 1) / 2;
            System.out.println(pentagonal);
        }
        sc.close();
    }
}
