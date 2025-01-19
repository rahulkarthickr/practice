import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int fact = 1;
            int rem = temp % 10;
            for (int i = rem; i >= 1; i--) {
                fact = fact * i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("Given number is a peterson number");
        } else {
            System.out.println("Given number is not a peterson number");
        }
        sc.close();
    }
}
