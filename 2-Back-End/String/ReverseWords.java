import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
        sc.close();
    }
}
