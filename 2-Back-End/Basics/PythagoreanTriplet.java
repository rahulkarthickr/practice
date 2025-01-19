import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        System.out.println("Enter third number :");
        int num3 = sc.nextInt();
        PythagoreasTriplet(num1, num2, num3);
        sc.close();
    }

    public static void PythagoreasTriplet(int a, int b, int c) {
        int first_sqr = a * a;
        int second_sqr = b * b;
        int third_sqr = c * c;
        if ((first_sqr + second_sqr) == third_sqr) {
            System.out.println("The given three numbers form a pythagorean triplet");
        } else {
            System.out.println("The given three numbers don't form a pythagorean triplet");
        }
    }
}
