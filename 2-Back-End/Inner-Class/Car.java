import java.util.Scanner;

public class Car {
    private String brand;

    Car(String brand) {
        this.brand = brand;
    }

    class Engine {
        void start() {
            System.out.println("Starting" + brand + "Engine");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand:");
        String brand = sc.nextLine();
        Car ob = new Car(brand);
        Car.Engine obj = ob.new Engine();
        obj.start();
        sc.close();
    }
}