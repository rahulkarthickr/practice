import java.util.Scanner;

public class OffensiveWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String replaced = "";
        for (int i = 0; i < str.length(); i++) {
            replaced += "@";
        }
        System.out.println("Offensive Word: " + str);
        System.out.println("Replaced Word: " + replaced);
        sc.close();
    }
}