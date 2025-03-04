interface Process {
    void deposit();

    void withdraw();

    void transaction();
}

public class BankAccount {
    public Process getUser() {
        return new CreateAccount();
    }

    private class CreateAccount implements Process {
        public void deposit() {
            System.out.println("Amount successfully deposited");
        }

        public void withdraw() {
            System.out.println("Amount successfully withdrawn");
        }

        public void transaction() {
            System.out.println("Transaction has been done successfully");
        }
    }

    public static void main(String[] args) {
        BankAccount ob = new BankAccount();
        Process obj = ob.getUser();
        obj.deposit();
        obj.withdraw();
        obj.transaction();
    }
}