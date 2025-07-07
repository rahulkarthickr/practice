import java.util.Scanner;

public class CharBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            char prev = str.charAt(i - 1);
            char current = str.charAt(i);
            char next = str.charAt(i + 1);
            if (Character.isDigit(prev) && Character.isLetter(current) && Character.isDigit(next)) {
                count++;
            }
        }
        System.out.println("Total characters between two digits: " + count);
        sc.close();
    }
}
