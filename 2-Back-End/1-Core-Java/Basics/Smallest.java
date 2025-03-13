import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int smallest = num;
        while (num > 0) {
            int rem = num % 10;
            if (rem >= 0 && smallest > rem) {
                smallest = rem;
            }
            num /= 10;
        }
        System.out.println(smallest);
        sc.close();
    }
}
