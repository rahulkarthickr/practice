import java.util.ArrayList;
import java.util.ListIterator;

public class ListItratr {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
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
    }
}
