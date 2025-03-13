import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int reversed_num = 0;
        while (temp > 0) {
            int rem = temp % 10;
            reversed_num = (reversed_num * 10) + rem;
            temp /= 10;
        }
        if (reversed_num == num) {
            System.out.println("Given number is a palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }
        sc.close();
    }
}
