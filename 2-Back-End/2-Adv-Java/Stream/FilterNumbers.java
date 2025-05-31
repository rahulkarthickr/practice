import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void main(String[] args) {
        List<String> words = List.of("one", "2wo", "3hree", "four", "5ive", "six");
        List<String> result = words.stream()
                .filter(word -> Character.isDigit(word.charAt(0)))
                .collect(Collectors.toList());
        for (String string : result) {
            System.out.println("Result: " + string);
        }
    }
}
