public class LambdaThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Hello from Lambda Thread!"));
        t.start();
    }
}
