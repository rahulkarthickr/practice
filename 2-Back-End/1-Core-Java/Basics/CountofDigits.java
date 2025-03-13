import java.util.Scanner;

public class CountofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            System.out.println(rem);
            count++;
            num /= 10;
        }
        System.out.println("Count of Digits for given number:" + count);
        sc.close();
    }
}
