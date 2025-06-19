import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int total = 100;
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        System.out.println("Enter no.of users: ");
        int users = sc.nextInt();
        booking(arr, users, sc, total);
        sc.close();
    }

    public static void booking(int[][] arr, int n, Scanner sc, int total) {
        for (int k = 0; k < n; k++) {
            System.out.println("Seats Available before booking: " + total);
            System.out.println("Enter the row number: ");
            int row = sc.nextInt();
            System.out.println("Enter the column number: ");
            int col = sc.nextInt();
            arr[row][col] = 1;
            total -= 1;
            System.out.println("Thank you for booking ticket.");
            System.out.println("Seats available after booking: " + total);
        }
    }
}
