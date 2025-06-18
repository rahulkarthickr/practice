import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item1 = 200;
        int item2 = 400;
        int item3 = 200;
        int item4 = 10;
        int item5 = 50;
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
        System.out.println("Item 3: " + item3);
        System.out.println("Item 4: " + item4);
        System.out.println("Item 5: " + item5);
        System.out.print("Enter the no.of items: ");
        int n = sc.nextInt();
        double discount = 0;
        int price = 0;
        double total = 0;
        int choice = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + " number from menu: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    price += item1;
                    break;
                case 2:
                    price += item2;
                    break;
                case 3:
                    price += item3;
                    break;
                case 4:
                    price += item4;
                    break;
                case 5:
                    price += item5;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice from the menu.");
                    i--;
                    break;
            }
        }
        if (price > 5000) {
            discount = 0.15 * price;
            total = price - discount;
            System.out.println("15 % discount applied. Total amount to be paid: " + total);
        } else if (price > 1000) {
            discount = 0.10 * price;
            total = price - discount;
            System.out.println("10 % discount applied. Total amount to be paid: " + total);
        } else {
            discount = 0.05 * price;
            total = price - discount;
            System.out.println("5 % discount applied. Total amount to be paid: " + total);
        }
        sc.close();
    }
}
