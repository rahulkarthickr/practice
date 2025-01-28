import java.util.Scanner;

class VowelsNotFound extends Exception {
    VowelsNotFound(String s) {
        super(s);
    }
}

public class Vowels {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        sc.close();
        boolean isVowel = false;
        int length = s.length();
        while (length > 0) {
            isVowel = false;
            char d = s.charAt(length - 1);
            if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
                System.out.println("Vowels present in the given string");
                isVowel = true;
            }
            length--;
        }
        if (!isVowel) {
            throw new VowelsNotFound("Vowels not present in the given string");
        }
    }
}