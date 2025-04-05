import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String result = Arrays.stream(str.split(" ")).map(word -> reverseString(word))
                .collect(Collectors.joining(" "));
        System.out.println(result);
        sc.close();
    }

    public static String reverseString(String str) {
        char[] c = str.toCharArray();
        String reversed = "";
        for (int i = c.length - 1; i >= 0; i--) {
            reversed += c[i];
        }
        return reversed;
    }
}
