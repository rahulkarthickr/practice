import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int dummy = temp;
        int count = 0;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            System.out.println("Digit:" + rem);
            temp /= 10;
            count++;
        }
        while (dummy > 0) {
            int r = dummy % 10;
            int l = 1;
            for (int i = 1; i <= count; i++) {
                l = l * r;
            }
            sum = l + sum;
            dummy /= 10;
        }
        if (sum == num) {
            System.out.println("Given number is an armstrong number");
        }
        sc.close();
    }
}