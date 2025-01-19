import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rad = scanner.nextFloat();
        float pi = (float) 3.14;
        float AreaofCir = pi * rad * rad; // Area of Circle
        System.out.println("Area of Circle:" + AreaofCir);
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float AreaofRect = length * width; // Area of Rectangle
        System.out.println("Area of Rectangle:" + AreaofRect);
        float breadth = scanner.nextFloat();
        float height = scanner.nextFloat();
        float AreaofTri = (float) (0.5 * breadth * height); // Area of Triangle
        System.out.println("Area of Triangle:" + AreaofTri);
        scanner.close();
    }
}