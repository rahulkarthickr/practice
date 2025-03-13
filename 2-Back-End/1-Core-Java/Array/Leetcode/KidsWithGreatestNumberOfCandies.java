import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of children:");
        int n = sc.nextInt();
        System.out.println("Enter the no.of candies for each child:");
        int[] candies = new int[n];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = sc.nextInt();
        }
        System.out.println("Enter the no.of extra candies:");
        int extraCandies = sc.nextInt();
        List<Boolean> greatest = kidsWithCandies(candies, extraCandies);
        System.out.println(greatest);
        sc.close();
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li = new ArrayList<>();
        int max = 0;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        for (int candy : candies) {
            li.add(candy + extraCandies >= max);
        }
        return li;
    }
}
