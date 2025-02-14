import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        ListIterator i = l.listIterator(3);
        while (i.hasNext()) {
            i.next(); // used to make the cursor move to last value
        }
        while (i.hasPrevious()) {
            System.out.println(" Reverse printing values using .next(): " + i.previous());
        }
        Iterator li = l.descendingIterator(); // This method is used only with LinkedList
        while (li.hasNext()) {
            System.out.println(" Reverse printing using .descendingIterator(); " + li.next());
        }
    }
}
