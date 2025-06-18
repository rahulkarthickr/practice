import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int index = 0;
        boolean isConsecutive = false;
        int[] arr = new int[n];
        while (n > 0) {
            int rem = n % 10;
            arr[index++] = rem;
            n /= 10;
        }
        for (int j = 0; j < index; j++) {
            if (arr[j] == 5) {
                if (arr[j + 1] == 5) {
                    if (arr[j + 2] == 5) {
                        isConsecutive = true;
                    }
                }
            }
        }
        System.out.println("Consecutive 5s in given number: " + isConsecutive);
        sc.close();
    }
}