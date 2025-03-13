import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of Digits for given number:" + sum);
        sc.close();
    }
}
