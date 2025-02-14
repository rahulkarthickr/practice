import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        char[] characters = s.toCharArray();
        int length = characters.length;
        String[] words = new String[length];
        int wordCount = 0;
        String temp = "";
        for (int i = 0; i < length; i++) {
            if (characters[i] == ' ' || i == length - 1) {
                if (i == length - 1 && characters[i] != ' ') {
                    temp += characters[i];
                }
                words[wordCount++] = reverseWord(temp);
                temp = "";
            } else {
                temp += characters[i];
            }
        }
        for (int i = wordCount - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
        sc.close();
    }

    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
