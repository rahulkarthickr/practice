import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] books = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter book " + (i + 1) + " name: ");
            books[i] = sc.nextLine().toUpperCase();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books[j].compareTo(books[j + 1]) > 0) {
                    String temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        System.out.println("Books after arranging in alphabetical order: ");
        for (String sr : books) {
            System.out.println(sr);
        }
        sc.close();
    }
}
