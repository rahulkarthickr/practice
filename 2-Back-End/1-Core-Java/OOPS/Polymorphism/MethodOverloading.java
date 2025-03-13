class Addition {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum of 2 integers: " + obj.add(5, 10));
        System.out.println("Sum of 3 integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 2.2));
    }
}
