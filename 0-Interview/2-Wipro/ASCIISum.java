import java.util.Scanner;

public class ASCIISum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first char array: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter first character array elements: ");
        char[] str1 = new char[n1];
        String input1 = sc.nextLine();
        for (int i = 0; i < n1 && i < input1.length(); i++) {
            str1[i] = input1.charAt(i);
        }
        System.out.println("Enter the size of second char array: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second character array elements: ");
        char[] str2 = new char[n2];
        String input2 = sc.nextLine();
        for (int i = 0; i < n1 && i < input2.length(); i++) {
            str2[i] = input2.charAt(i);
        }
        System.out.println("Enter the first target character index from first character array: ");
        int target1 = sc.nextInt();
        System.out.println("Enter second target character index from second character array: ");
        int target2 = sc.nextInt();
        if (target1 < 0 || target1 >= n1 || target2 < 0 || target2 >= n2) {
            System.out.println("Error: Target index out of bounds.");
        } else {
            int asciiSum = (int) str1[target1] + (int) str2[target2];
            int digitSum = 0;
            while (asciiSum > 0) {
                digitSum += asciiSum % 10;
                asciiSum /= 10;
            }
            System.out.println("ASCII Sum of target characters: " + digitSum);
        }
        sc.close();
    }
}
