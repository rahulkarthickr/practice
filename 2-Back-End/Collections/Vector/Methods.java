import java.util.Vector;

public class Methods {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        // .add()
        v.add("Hi");
        v.add("Hello");
        v.add("Welcome");
        System.out.println(v);
        // .capacity()
        System.out.println(v.capacity());
    }
}
