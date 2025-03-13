import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Shopping {
    int id;
    String product;
    int price;
    int discount;

    Shopping(int id, String product, int price, float discount) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.discount = (int) discount;
    }

    public static void getUserDetails(LinkedList<Shopping> user, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter user id:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter product:");
            String product = sc.nextLine();
            System.out.println("Enter the price:");
            int price = sc.nextInt();
            float discount = price * 0.20f;
            user.add(new Shopping(id, product, price, discount));
        }
    }

    public static void displayUsers(LinkedList<Shopping> user, int n) {
        ListIterator<Shopping> li = user.listIterator();
        for (int i = 0; i < n && li.hasNext(); i++) {
            Shopping shop = li.next();
            boolean isValid = false;
            if (shop.price == 0) {
                li.remove();
                System.out.println("User_ID" + " " + shop.id + " " + "has been removed due to zero price");
                continue;
            }
            isValid = true;
            System.out.println("User_ID: " + shop.id + ", Product: " + shop.product + ", Price: " + shop.price
                    + ", Discount: " + (shop.price > 1000 ? "30%" : "20%"));
            if (!isValid) {
                System.out.println("No valid users to be displayed");
            }
        }
    }

    public static void calcTotal(LinkedList<Shopping> user, int n) {
        ListIterator<Shopping> li = user.listIterator();
        for (int i = 0; i < n && li.hasNext(); i++) {
            Shopping shop = li.next();
            int discount;
            boolean isValid = false;
            if (shop.price == 0) {
                li.remove();
                System.out.println("User_ID" + shop.id + "has been removed due to zero price");
                continue;
            }
            isValid = true;
            if (shop.price > 1000) {
                discount = (int) (shop.price * 0.30);
            } else {
                discount = (int) (shop.price * 0.20);
            }
            int grandTotal = shop.price - discount;
            System.out.println("Total Amount: Rs." + grandTotal + " for user_id " + shop.id +
                    " (" + (shop.price > 1000 ? "30%" : "20%") + " Discount Applied)");
            if (!isValid) {
                System.out.println("No valid users to be displayed");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Shopping> user = new LinkedList<>();
        System.out.println("Enter the number of users:");
        int users = sc.nextInt();
        getUserDetails(user, users, sc);
        displayUsers(user, users);
        calcTotal(user, users);
    }
}
