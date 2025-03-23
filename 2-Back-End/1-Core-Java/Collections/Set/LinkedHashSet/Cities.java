import java.util.Iterator;
import java.util.LinkedHashSet;

public class Cities {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        // add() - Adds elements to the set
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("New York"); // Duplicate, won't be added
        System.out.println("Cities: " + cities);
        // contains() - Checks if an element exists
        System.out.println("Contains Paris? " + cities.contains("Paris"));
        System.out.println("Contains Sydney? " + cities.contains("Sydney"));
        // remove() - Removes a specific element
        cities.remove("Tokyo");
        System.out.println("After removing Tokyo: " + cities);
        // size() - Returns the number of elements
        System.out.println("Size of LinkedHashSet: " + cities.size());
        // isEmpty() - Checks if the set is empty
        System.out.println("Is LinkedHashSet empty? " + cities.isEmpty());
        // Iterating using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String city : cities) {
            System.out.println(city);
        }
        // Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // addAll() - Adds all elements from another collection
        LinkedHashSet<String> moreCities = new LinkedHashSet<>();
        moreCities.add("Berlin");
        moreCities.add("Rome");
        cities.addAll(moreCities);
        System.out.println("After adding more cities: " + cities);
        // toArray() - Converts the set to an array
        String[] citiesArray = cities.toArray(new String[0]);
        System.out.println("Array from LinkedHashSet:");
        for (String city : citiesArray) {
            System.out.println(city);
        }
        // clear() - Removes all elements
        cities.clear();
        System.out.println("After clearing, is empty? " + cities.isEmpty());
    }
}
