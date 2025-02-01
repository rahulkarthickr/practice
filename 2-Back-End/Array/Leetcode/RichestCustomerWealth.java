import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] accounts = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts.length; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
        sc.close();
    }

    public static int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentwealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentwealth += accounts[i][j];
            }
            if (currentwealth > maxwealth) {
                maxwealth = currentwealth;
            }
        }
        return maxwealth;
    }
}
