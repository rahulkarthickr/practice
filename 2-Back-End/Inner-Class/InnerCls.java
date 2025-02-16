// Outer class

import java.util.Scanner;

public class InnerCls {
    private int balance;

    InnerCls(int balance) {
        this.balance = balance;
    }

    void amount() {
        // Local class
        class MethodCls {
            // 8. Printing "Local Method" + balance
            void demo() {
                System.out.println("Local Method" + balance);
            }
        }
        // 6. Creating an instance of the local class
        MethodCls ob = new MethodCls();
        // 7. Calling demo() method
        ob.demo();
    }

    // Inner member class
    class SubCls {
        // 4. Printing "Inner Member" + balance
        void getBalance() {
            System.out.println("Inner Member" + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance:");
        int balance = sc.nextInt();
        // 1. Creating an instance of the outer class
        InnerCls obj = new InnerCls(balance);
        // 2. Creating an instance of the inner member class
        InnerCls.SubCls ob = obj.new SubCls();
        // 3. Calling the method of the inner member class
        ob.getBalance();
        // 5. Calling the amount() method which internally uses the local class
        obj.amount();
        sc.close();
    }
}
