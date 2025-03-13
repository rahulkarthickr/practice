import java.util.Scanner;

public class Decode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        String result = decode(str);
        System.out.println("Decoded String:" + result);
        sc.close();
    }

    public static String decode(String s) {
        String result = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char current_char = s.charAt(i);
            if (current_char >= '0' && current_char <= '9') {
                int count = current_char - '0';
                if (i + 1 < length) {
                    char next_char = s.charAt(i + 1);
                    for (int j = 0; j < count; j++) {
                        result += next_char;
                    }
                    i++;
                }
            }
        }
        return result;
    }
}