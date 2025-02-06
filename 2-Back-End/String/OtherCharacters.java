import java.util.Scanner;

public class OtherCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int firstIndex = -1;
        int lastIndex = -1;
        StringBuilder final_str = new StringBuilder();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = c.length - 1; j > i; j--) {
                if (c[i] == c[j]) {
                    firstIndex = i;
                    lastIndex = j;
                    break;
                }
                if (firstIndex != -1)
                    break;
            }
        }
        if (firstIndex != -1 && lastIndex != -1) {
            for (int k = firstIndex + 1; k < lastIndex; k++) {
                final_str.append(c[k]);
            }
        } else {
            System.out.println("No repeating characters found");
        }
        System.out.println("Remaining characters of the string:" + final_str);
        sc.close();
    }
}
