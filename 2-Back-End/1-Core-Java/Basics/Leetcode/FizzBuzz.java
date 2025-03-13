import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> result = fizzBuzz(num);
        System.out.println(result);
        sc.close();
    }

    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> li = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    li.add("FizzBuzz");
                } else {
                    li.add("Fizz");
                }
            } else if (i % 5 == 0) {
                li.add("Buzz");
            } else {
                li.add(Integer.toString(i));
            }
        }
        return li;
    }
}
