import java.util.Scanner;

class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM");
		System.out.println("Enter your pin.no:");
		int pin_no = sc.nextInt();
		System.out.println("Enter user name:");
		String user_name = sc.next();
		System.out.println("Enter your balance:");
		int balance = sc.nextInt();
		int choice;
		do {
			System.out.println("ATM Services");
			System.out.println("------------");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Balance");
			System.out.println("4. Exit");
			System.out.println("------------");
			System.out.println("Enter your choice of service:");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter your pin:");
					int temp_pin = sc.nextInt();
					System.out.println("Enter username:");
					String temp_usr = sc.next();
					if (temp_pin == pin_no && user_name.equals(temp_usr)) {
						System.out.println("Enter the withdrawl amount:");
						int withdrawl_amnt = sc.nextInt();
						System.out.println("Amount has successfully withdrawn");
						balance -= withdrawl_amnt;
					} else {
						System.out.println("Invalid pin number or user name");
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
						System.out.println("Amount has successfully deposited");
						balance += deposited_amnt;
					} else {
						System.out.println("Invalid pin number or user name");
					}
					break;
				case 3:
					System.out.println("Enter your pin:");
					int bal_pin = sc.nextInt();
					System.out.println("Enter username:");
					String bal_usr = sc.next();
					if (bal_pin == pin_no && bal_usr.equals(user_name)) {
						System.out.println("Balance:" + balance);
					} else {
						System.out.println("Invalid pin number or user name");
					}
					break;
				case 4:
					System.out.println("Thank you!! Visit Again!!");
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		} while (choice != 4);
		sc.close();
	}
}