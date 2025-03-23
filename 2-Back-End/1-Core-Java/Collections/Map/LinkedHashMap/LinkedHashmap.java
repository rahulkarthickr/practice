import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        // Adding elements using put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        // Displaying the LinkedHashMap
        System.out.println("Initial LinkedHashMap: " + map);
        // Accessing an element using get()
        System.out.println("Value for key 2: " + map.get(2));
        // Checking if a key exists using containsKey()
        System.out.println("Contains key 3? " + map.containsKey(3));
        // Checking if a value exists using containsValue()
        System.out.println("Contains value 'Date'? " + map.containsValue("Date"));
        // Removing an element using remove()
        map.remove(3);
        System.out.println("After removing key 3: " + map);
        // Getting the size of the map
        System.out.println("Size of map: " + map.size());
        // Checking if the map is empty
        System.out.println("Is map empty? " + map.isEmpty());
        // Iterating through the map using for-each loop
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // Using keySet() to get all keys
        System.out.println("Keys: " + map.keySet());
        // Using values() to get all values
        System.out.println("Values: " + map.values());
        // Using entrySet() to get key-value pairs
        System.out.println("Entry Set: " + map.entrySet());
        // Replacing a value using replace()
        map.replace(2, "Blueberry");
        System.out.println("After replacing value of key 2: " + map);
        // Clearing the map
        map.clear();
        System.out.println("After clearing map: " + map);
    }
}
