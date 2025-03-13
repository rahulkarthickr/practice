import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isHappy = isHappy(num);
        System.out.println(isHappy);
        sc.close();
    }

    public static boolean isHappy(int n) {
        int power = 0;
        boolean isHappy = false;
        while (n != 1 && n != 4) {
            power = 0;
            while (n > 0) {
                power += Math.pow((n % 10), 2);
                n /= 10;
            }
            n = power;
        }
        if (n == 1) {
            isHappy = true;
        }
        return isHappy;
    }
}
