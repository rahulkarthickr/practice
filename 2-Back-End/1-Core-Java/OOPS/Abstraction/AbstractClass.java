package Abstraction;

abstract class Shape {
    abstract void draw();
}

// Concrete Class (provides implementation for the abstract method)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
