import java.util.Scanner;

public class GuessTheWord {
    static Scanner sc = new Scanner(System.in);
    static String secret_word;
    static char[] maskedWord;

    public static void player1() {
        System.out.println("Welcome Player 1");
        System.out.println("Enter the secret word: ");
        sc.nextLine();
        secret_word = sc.nextLine();
        maskedWord = new char[secret_word.length()];
        for (int i = 0; i < secret_word.length(); i++) {
            maskedWord[i] = '*';
        }
        System.out.println("Thank you for the secret word.");
    }

    public static void player2() {
        if (secret_word == null || secret_word.isEmpty()) {
            System.out.println("No secret word has been set. Player 1 needs to enter it first.");
            return;
        }
        System.out.println("Welcome Player 2");
        System.out.println("Let's find the secret word. 5 chances to find to the secret word.");
        int chances = 5;
        while (chances > 0) {
            System.out.println("\nWord: " + String.valueOf(maskedWord));
            System.out.println("Enter a character to find the word (Chances left: " + chances + "): ");
            char ch = sc.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < secret_word.length(); i++) {
                if (secret_word.charAt(i) == ch) {
                    maskedWord[i] = ch;
                    found = true;
                }
            }
            if (!found) {
                chances--;
            }
            if (String.valueOf(maskedWord).equals(secret_word)) {
                System.out.println("\nCongratulations! You guessed the word: " + secret_word);
                return;
            }
        }
        System.out.println("\nGame Over! The secret word was: " + secret_word);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter 1 for Player 1 (Secret Word Teller)");
            System.out.println("Enter 2 for Player 2 (Secret Word Finder)");
            System.out.println("Enter 3 to Exit");
            System.out.println("Enter your choice (1 - 3): ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    player1();
                    break;
                case 2:
                    player2();
                    break;
                case 3:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Wrong option. Please try again.");
            }
        }
    }
}