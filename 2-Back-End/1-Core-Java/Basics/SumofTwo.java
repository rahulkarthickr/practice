import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of first and second number:" + sum);
        sc.close();
    }
}