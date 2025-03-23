import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylist {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
        // add()
        al.add(100);
        al.add(200);
        al.add(300);
        al.addIfAbsent(400); // Adds only if 400 is not present
        al.addAll(List.of(500, 600));
        // Iterating using ListIterator
        ListIterator<Integer> li = al.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();
        for (Integer num : al) {
            System.out.print(num + " ");
        }
        System.out.println();
        // replaceAll()
        al.replaceAll(n -> (n == 100) ? 400 : n);
        // remove()
        al.remove(Integer.valueOf(200));
        // get()
        System.out.println("First element: " + al.get(0));
        // contains()
        System.out.println("Contains 300? " + al.contains(300));
        // size()
        System.out.println("Size: " + al.size());
        // toArray()
        Object[] arr = al.toArray();
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();
        // clear()
        al.clear();
        System.out.println("List after clear: " + al);
    }
}
