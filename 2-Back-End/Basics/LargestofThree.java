import java.util.Scanner;

public class LargestofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("First number is the greatest of all three");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second number is the greatest of all three");
        } else {
            System.out.println("Third number is the greatest of all three");
        }
        sc.close();
    }
}
