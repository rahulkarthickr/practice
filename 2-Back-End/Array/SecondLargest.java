import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
        }
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int largest = array[0];
        int secondLargest = -1;
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] < largest && (secondLargest == -1 || array[i] > secondLargest)) {
                secondLargest = array[i];
            }
        }
        System.out.println("Second largest element in the array: " + secondLargest);
        sc.close();
    }
}
