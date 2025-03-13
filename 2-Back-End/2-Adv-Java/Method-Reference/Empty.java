import java.util.Scanner;
import java.util.function.Predicate;

public class Empty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        Predicate<String> isEmptyCheck = String::isEmpty;
        if (isEmptyCheck.test(str)) {
            System.out.println("The given string is empty.");
        } else {
            System.out.println("The given string is not empty.");
        }
        sc.close();
    }
}
