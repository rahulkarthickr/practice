import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        boolean palindrome = isPalindrome(str);
        System.out.println("Is the given string a palindrome:" + palindrome);
        sc.close();
    }

    public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int length = c.length;
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (c[i] == ' ' || i == length - 1) {
                if (i == length - 1 && c[i] != ' ') {
                    temp.append(c[i]);
                }
                result.append(temp.reverse().toString());
                if (c[i] == ' ') {
                    result.append(' ');
                }
                temp.setLength(0);
            } else {
                temp.append(c[i]);
            }
        }
        if (s.equals(result.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
