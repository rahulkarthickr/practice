import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
