class UserLimitException extends Exception {
    UserLimitException(String s) {
        super();
    }
}

public class UserDefinedException {
    public static void main(String[] args) throws Exception {
        int logincount = 110;
        if (logincount < 100) {
            System.out.println("Login Successfully");
        } else {
            throw new UserLimitException("User Limit has reached its end");
        }
    }
}
