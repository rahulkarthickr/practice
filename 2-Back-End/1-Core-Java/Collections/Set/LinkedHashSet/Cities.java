import java.util.LinkedHashSet;

public class Cities {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("New York");
        System.out.println("Cities: " + cities);
        System.out.println("Contains Paris? " + cities.contains("Paris"));
        cities.remove("Tokyo");
        System.out.println("After removing Tokyo: " + cities);
        System.out.println("Iterating through LinkedHashSet:");
        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println("Size of LinkedHashSet: " + cities.size());
        cities.clear();
        System.out.println("Is LinkedHashSet empty? " + cities.isEmpty());
    }
}
