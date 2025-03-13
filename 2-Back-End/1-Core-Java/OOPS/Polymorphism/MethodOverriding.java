class Vehicle {
    void run() {
        System.out.println("The vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("The car is moving fast");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle myvehicle = new Vehicle();
        myvehicle.run();
    }
}
