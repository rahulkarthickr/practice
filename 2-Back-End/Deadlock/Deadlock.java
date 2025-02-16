class BankAccount {
    private int balance;
    private final String name;

    // 2. Constructor to initialize the bank account with a name and balance
    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void transfer(BankAccount to, int amount) {
        // 6. First locks this account (account A)
        // 11. First locks this account (account B)
        synchronized (this) {
            // 7. Prints: "Thread-1 locked Account A"
            // 12. Prints: "Thread-2 locked Account B"
            System.out.println(Thread.currentThread().getName() + " locked " + this.getName());
            try {
                // 8. Thread t1 sleeps for 100ms
                // 13. Thread t1 sleeps for 100ms
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            // 14. After 100ms, Thread t1 wakes up and reaches this line
            // 17. At the same time, t2 also wakes up and reaches this line
            synchronized (to) { // 15. t1 attempts to lock Account B // 18. t2 attempts to lock Account A
                // 16. But Account B is already locked by t2, so t1 waits for t2 to release it
                // 19. But Account A is already locked by t1, so t2 waits for t1 to release it
                // 20. Both threads remain blocked indefinitely, causing a deadlock
                System.out.println(Thread.currentThread().getName() + " locked " + to.getName());
                this.withdraw(amount);
                to.deposit(amount);
                System.out.println("Transferred " + amount + " from " + this.getName() + " to " + to.getName());
            }
        }
    }
}

public class Deadlock {
    public static void main(String[] args) {
        // 1. Creating two bank accounts with initial balances using constructor
        BankAccount accountA = new BankAccount("Account A", 1000);
        BankAccount accountB = new BankAccount("Account B", 1000);
        // 3. Creating two threads that try to transfer money between the accounts
        // Constructor of Thread takes an instance of an anonymous Runnable class
        // The run() method of this anonymous Runnable class is overridden
        Thread t1 = new Thread(new Runnable() {
            @Override
            // 5. Calls the transfer()
            // To transfer 200 from from account A to B
            public void run() {
                accountA.transfer(accountB, 200);
            }
        }, "Thread-1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            // 10. Calls the transfer()
            // To transfer 300 from from account B to A
            public void run() {
                accountB.transfer(accountA, 300);
            }
        }, "Thread-2");
        // 4. Starts thread t1
        t1.start();
        // 9. Starts thread t2
        t2.start();
    }
}
