import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ArrayList<Integer> al = new ArrayList<>();
                System.out.println("Enter the array size: ");
                int num = sc.nextInt();
                System.out.println("Enter the array elements: ");
                int[] arr = new int[num];
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();
                }
                for (int j : arr) {
                        al.add(arr[j]);
                }
                System.out.println("Arraylist: " + al);
                // forEach()
                al.stream().forEach(a -> System.out.println(a));
                // count()
                System.out.println("Count of elements in arraylist: " + al.stream().count());
                // filter()
                System.out.println("Count of even nums in the given arraylist: "
                                + al.stream().filter(b -> b % 2 == 0).count());
                // map()
                System.out.println("Even nums in given arraylist with string 'java' : "
                                + al.stream().filter(c -> c % 2 == 0).map(d -> d + "Java")
                                                .collect(Collectors.toList()));
                // sorted()
                System.out.println("Sorted Arraylist (Ascending Order): "
                                + al.stream().sorted().collect(Collectors.toList()));
                System.out.println("Sorted Arraylist (Descending Order): "
                                + al.stream().sorted((x, y) -> y - x).collect(Collectors.toList()));
                // distinct()
                System.out.println("Distinct elements in given sorted arraylist: "
                                + al.stream().sorted().distinct().collect(Collectors.toList()));
                // limit()
                System.out.println("Enter the limit up to which the given arraylist elements will be printed below: ");
                int Limit = sc.nextInt();
                System.out.println("Elements which is up to the limit " + Limit + " in the given arraylist: "
                                + al.stream().limit(Limit).collect(Collectors.toList()));
                // skip()
                System.out.println("Enter the number of elements to be skipped: ");
                int Skip = sc.nextInt();
                System.out.println("Elements after skipping " + Skip + " elements from the given arraylist: "
                                + al.stream().skip(Skip).collect(Collectors.toList()));
                // reduce()
                System.out.println(al.stream().reduce((n, m) -> n + m).get());
                // min()
                System.out.println(al.stream().min((t, t1) -> t - t1).get());
                // anyMatch()
                System.out.println("Even elements in given arraylist: " + al.stream().anyMatch(q -> q % 2 == 0));
                sc.close();
        }
}
