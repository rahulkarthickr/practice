import java.util.Scanner;

public class Power {

    public static long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        }
        int power = 1;
        for (int i = 0; i < p; i++) {
            power *= n;
        }
        return (long) power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        try {
            long result = power(n, p);
            System.out.println("Power: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}