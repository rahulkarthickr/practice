import java.util.Stack;

public class Methods {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // .push()
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        // .pop()
        System.out.println(s.pop());
        System.out.println(s);
        // .search()
        System.out.println(s.search(30));
        // .peek()
        System.out.println(s.peek());
        // .capacity()
        System.out.println(s.capacity());
    }
}
