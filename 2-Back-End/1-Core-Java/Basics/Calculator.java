import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator (+, -, *, /, %) or 'x' to exit:");
            char op = scanner.next().trim().charAt(0);
            if (op == 'x' || op == 'X') {
                break;
            }
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                switch (op) {
                    case '+':
                        ans = num1 + num2;
                        break;
                    case '-':
                        ans = num1 - num2;
                        break;
                    case '*':
                        ans = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            ans = num1 / num2;
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                    case '%':
                        ans = num1 % num2;
                        break;
                }
                System.out.println("Result: " + ans);
            } else {
                System.out.println("Invalid Operation");
            }
        }
        scanner.close();
    }
}