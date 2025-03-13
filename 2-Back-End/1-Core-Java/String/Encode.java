import java.util.Scanner;

public class Encode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        String res = encode(str);
        System.out.println("Encoded String:" + res);
        sc.close();
    }

    public static String encode(String s) {
        String result = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char currentchar = s.charAt(i);
            int count = 1;
            while (i + 1 < length && s.charAt(i + 1) == currentchar) {
                count++;
                i++;
            }
            result += count + "" + currentchar;
        }
        return result;
    }
}