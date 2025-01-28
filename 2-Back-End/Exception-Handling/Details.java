import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String mail_id = "";
        long phone_no = 0;
        input(name, mail_id, phone_no, sc);
    }

    public static void input(String name, String mail, long phone, Scanner sc) {
        try {
            boolean hasName = false;
            while (!hasName) {
                System.out.println("Enter your name:");
                name = sc.nextLine();
            }
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    hasName = true;
                } else {
                    hasName = false;
                    System.out.println("Please enter only character");
                    break;
                }
            }
            if (hasName) {
                System.out.println("Enter your mail-id:");
                mail = sc.nextLine();
                while (!hasName) {
                    System.out.println("Enter your phone number:");
                    phone = sc.nextLong();
                }
            }
        } catch (Exception e) {
            System.out.println("Please enter the correct input");
            sc.nextLine();
            System.out.println("Enter your name:");
            name = sc.nextLine();
            System.out.println("Enter the Mail-id:");
            mail = sc.nextLine();
            System.out.println("Enter the phone number:");
            phone = sc.nextLong();
        } finally {
            System.out.println("Your attempt has been recorded");
        }
        sc.nextLine();
        System.out.println("Details Entered");
        System.out.println("Name:" + name);
        System.out.println("Mail ID:" + mail);
        System.out.println("Phone Number:" + phone);
    }
}
