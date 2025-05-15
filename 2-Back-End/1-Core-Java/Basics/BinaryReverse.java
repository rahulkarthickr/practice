import java.util.Scanner;

public class BinaryReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal integer: ");
        int n = sc.nextInt();
        String str1 = Integer.toBinaryString(n);
        char[] b1 = str1.toCharArray();
        String ans = "";
        for (int i = b1.length - 1; i >= 0; i++) {
            ans += b1[i];
        }
        int b2 = Integer.parseInt(ans, 2);
        System.out.println(b2);
        sc.close();
    }
}
