import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // put() - Insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        // putIfAbsent() - Adds only if key is absent
        map.putIfAbsent(3, "Grapes"); // Will not replace "Cherry"
        map.putIfAbsent(5, "Elderberry");
        // get() - Retrieve value by key
        System.out.println("Value for key 2: " + map.get(2)); // Banana
        // containsKey() - Check if key exists
        System.out.println("Contains key 3? " + map.containsKey(3)); // true
        // containsValue() - Check if value exists
        System.out.println("Contains value 'Date'? " + map.containsValue("Date")); // true
        // remove() - Remove an entry by key
        map.remove(4);
        // remove(K, V) - Remove only if key-value pair matches
        boolean isRemoved = map.remove(5, "Elderberry"); // true
        System.out.println("Was key 5 removed? " + isRemoved);
        // replace() - Replace value for a given key
        map.replace(2, "Blueberry");
        // replace(K, V, V) - Replace only if current value matches
        boolean replaced = map.replace(3, "Cherry", "Coconut");
        System.out.println("Was key 3 replaced? " + replaced);
        // keySet() - Get all keys
        System.out.println("Keys: " + map.keySet());
        // values() - Get all values
        System.out.println("Values: " + map.values());
        // entrySet() - Get all key-value pairs
        System.out.println("Entries: " + map.entrySet());
        // isEmpty() - Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());
        // size() - Get the number of key-value pairs
        System.out.println("Size of map: " + map.size());
        // clear() - Remove all elements
        map.clear();
        System.out.println("Size after clear(): " + map.size());
    }
}
