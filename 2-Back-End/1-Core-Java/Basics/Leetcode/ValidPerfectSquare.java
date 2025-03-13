import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isValid = isPerfectSquare(num);
        System.out.println(isValid);
        sc.close();
    }

    public static boolean isPerfectSquare(int num) {
        int sqr = (int) Math.sqrt(num);
        return sqr * sqr == num;
    }
}
