interface Greeting {
    void sayhello();
}

public class Greet {
    public static void main(String[] args) {
        Greeting ob = new Greeting() {
            public void sayhello() {
                System.out.println("Hello inside main method");
            }
        };
        ob.sayhello();
    }
}
