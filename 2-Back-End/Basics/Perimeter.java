import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rad = scanner.nextFloat();
        float pi = (float) 3.14;
        float PeriofCir = 2 * pi * rad; // Perimeter of Circle
        System.out.println("Perimeter of Circle:" + PeriofCir);
        float side = scanner.nextFloat();
        float PeriofSqr = 4 * side;
        System.out.println("Perimeter of Square:" + PeriofSqr);
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float PeriofRect = 2 * (length + width); // Perimeter of Rectangle
        System.out.println("Perimeter of Rectangle:" + PeriofRect);
        scanner.close();
    }
}