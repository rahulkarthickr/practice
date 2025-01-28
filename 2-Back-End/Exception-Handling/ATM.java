import java.util.InputMismatchException;
import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Welcome to ATM");
            int pin_no;
            while (true) {
                System.out.println("Enter your pin number:");
                try {
                    pin_no = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a numeric pin number.");
                    sc.nextLine();
                }
            }
            System.out.println("Enter your username:");
            String user_name = sc.next();
            int balance;
            while (true) {
                System.out.println("Enter your balance:");
                try {
                    balance = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a numeric balance.");
                    sc.nextLine();
                }
            }
            int choice = 0;
            do {
                System.out.println("ATM Services");
                System.out.println("------------");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Balance");
                System.out.println("4. Exit");
                System.out.println("------------");
                System.out.println("Enter your choice of service:");
                while (true) {
                    try {
                        choice = sc.nextInt();
                        if (choice < 1 || choice > 4) {
                            System.out.println("Invalid choice! Please enter a number between 1 and 4:");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a number between 1 and 4:");
                        sc.nextLine();
                    }
                }
                switch (choice) {
                    case 1:
                        System.out.println("Enter your pin:");
                        int temp_pin = sc.nextInt();
                        System.out.println("Enter username:");
                        String temp_usr = sc.next();
                        if (temp_pin == pin_no && user_name.equals(temp_usr)) {
                            System.out.println("Enter the withdrawal amount:");
                            int withdrawal_amnt = sc.nextInt();
                            if (withdrawal_amnt > balance) {
                                System.out.println("Insufficient balance!");
                            } else if (withdrawal_amnt <= 0) {
                                System.out.println("Withdrawal amount must be greater than zero!");
                            } else {
                                balance -= withdrawal_amnt;
                                System.out.println("Amount successfully withdrawn. Remaining balance: " + balance);
                            }
                        } else {
                            System.out.println("Invalid pin number or username.");
                        }
                        break;
                    case 2:
                        System.out.println("Enter your pin:");
                        int dep_pin = sc.nextInt();
                        System.out.println("Enter username:");
                        String dep_usr = sc.next();
                        if (dep_pin == pin_no && dep_usr.equals(user_name)) {
                            System.out.println("Enter the amount to be deposited:");
                            int deposited_amnt = sc.nextInt();
                            if (deposited_amnt <= 0) {
                                System.out.println("Deposit amount must be greater than zero!");
                            } else {
                                balance += deposited_amnt;
                                System.out.println("Amount successfully deposited. Current balance: " + balance);
                            }
                        } else {
                            System.out.println("Invalid pin number or username.");
                        }
                        break;
                    case 3:
                        System.out.println("Enter your pin:");
                        int bal_pin = sc.nextInt();
                        System.out.println("Enter username:");
                        String bal_usr = sc.next();
                        if (bal_pin == pin_no && bal_usr.equals(user_name)) {
                            System.out.println("Current balance: " + balance);
                        } else {
                            System.out.println("Invalid pin number or username.");
                        }
                        break;
                    case 4:
                        System.out.println("Thank you!! Visit Again!!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                        break;
                }
            } while (choice != 4);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
