import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            Fact ob = new Fact();
            long factorial = ob.calculateFactorial(number);
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        sc.close();
    }

    public long calculateFactorial(int number) {
        class FactorialCalc {
            public int calculate(int n) {
                if (n == 0) {
                    return 1;
                } else {
                    return n * calculate(n - 1);
                }
            }
        }
        FactorialCalc obj = new FactorialCalc();
        return obj.calculate(number);
    }
}
