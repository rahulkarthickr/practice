import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Elements {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        // add()
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(60);
        System.out.println("TreeSet: " + treeSet);
        // first() - Retrieves the first (lowest) element
        System.out.println("First element: " + treeSet.first());
        // last() - Retrieves the last (highest) element
        System.out.println("Last element: " + treeSet.last());
        // remove() - Removes a specific element
        treeSet.remove(30);
        System.out.println("After removing 30: " + treeSet);
        // contains() - Checks if an element exists
        System.out.println("Contains 40? " + treeSet.contains(40));
        // size() - Returns the number of elements
        System.out.println("Size of TreeSet: " + treeSet.size());
        // isEmpty() - Checks if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());
        // clear() - Removes all elements
        TreeSet<Integer> tempSet = new TreeSet<>(treeSet);
        tempSet.clear();
        System.out.println("After clearing tempSet: " + tempSet);
        // higher() - Retrieves lowest element greater than the given element
        System.out.println("Higher than 40: " + treeSet.higher(40));
        // lower() - Retrieves highest element less than the given element
        System.out.println("Lower than 40: " + treeSet.lower(40));
        // ceiling() - Retrieves least element greater than or equal to given element
        System.out.println("Ceiling of 35: " + treeSet.ceiling(35));
        // floor() - Retrieves greatest element less than or equal to given element
        System.out.println("Floor of 35: " + treeSet.floor(35));
        // pollFirst() - Retrieves and removes the first (lowest) element
        System.out.println("Poll First: " + treeSet.pollFirst());
        System.out.println("After pollFirst: " + treeSet);
        // pollLast() - Retrieves and removes the last (highest) element
        System.out.println("Poll Last: " + treeSet.pollLast());
        System.out.println("After pollLast: " + treeSet);
        // descendingSet() - Returns a reverse order view of elements
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println("Descending Set: " + descendingSet);
        // subSet() - Returns a view of the portion of this set (start, end)
        System.out.println("Subset (20 to 50): " + treeSet.subSet(20, 50));
        // headSet() - Returns a view of elements less than the given element
        System.out.println("HeadSet (less than 40): " + treeSet.headSet(40));
        // tailSet() - Returns a view of elements greater than or equal to given element
        System.out.println("TailSet (greater than or equal to 40): " + treeSet.tailSet(40));
        // 18. iterator() - Iterates over elements in ascending order
        System.out.println("Iterating using iterator:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // descendingIterator() - Iterates over elements in descending order
        System.out.println("Iterating in descending order:");
        Iterator<Integer> descIterator = treeSet.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}
