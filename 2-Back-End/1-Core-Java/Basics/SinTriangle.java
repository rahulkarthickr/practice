import java.util.Scanner;

public class SinTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.println("Enter the height value: ");
        int height = sc.nextInt();
        System.out.println("Enter the angle: ");
        double c = sc.nextDouble();
        double area = 0.5 * base * height * Math.sin(c);
        System.out.println("Area: " + area);
        sc.close();
    }
}
