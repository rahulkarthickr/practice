import java.util.Scanner;
import java.util.function.BiFunction;

public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BiFunction<String, String, String> concatenate = String::concat;
        System.out.println("Enter string 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2:");
        String str2 = sc.nextLine();
        String result = concatenate.apply(str1, str2);
        System.out.println("Concatenation of given two strings: " + result);
        sc.close();
    }
}