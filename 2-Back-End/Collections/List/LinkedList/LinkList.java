import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        Iterator<String> li = l.descendingIterator(); // This method is used only with LinkedList
        while (li.hasNext()) {
            System.out.println(" Reverse printing using .descendingIterator(): " + li.next());
        }
    }
}
