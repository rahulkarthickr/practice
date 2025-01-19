import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rad = scanner.nextFloat();
        float pi = (float) 3.14;
        float Vol_of_Sphere = (4 / 3) * pi * rad * rad * rad; // Volume of Sphere
        System.out.println("Volume of Sphere:" + Vol_of_Sphere);
        float height = scanner.nextFloat();
        float Vol_of_Cylinder = pi * rad * rad * height; // Volume of Cylinder
        System.out.println("Volume of Cone:" + Vol_of_Cylinder);
        float Vol_of_Cone = (1 / 3) * pi * rad * rad * height; // Volume of Cone
        System.out.println("Volume of Cone:" + Vol_of_Cone);
        scanner.close();
    }
}