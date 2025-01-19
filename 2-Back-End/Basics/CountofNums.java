import java.util.Scanner;

public class CountofNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println("Enter the desired digit in the given number:");
        int num = scanner.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == num) {
                count++;
            }
            n /= 10;
        }
        System.out.println("The digit " + num + " " + "has occured" + " " + count + " times in the given number.");
        scanner.close();
    }
}