public class Shadowing {

    int x = 10; // This is a global variable

    public void method() {
        int x = 20; // This is a local variable that shadows the global variable
        System.out.println(x); // This will print 20
    }

    public static void main(String[] args) {
        Shadowing example = new Shadowing();
        example.method();
        System.out.println(example.x); // This will print 10
    }
}
