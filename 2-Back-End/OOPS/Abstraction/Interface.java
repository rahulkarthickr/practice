package Abstraction;

import java.util.Scanner;

interface types {
    // Abstract methods in the interface should follow the same method signature as
    // the overriden method
    void friendly(String str);

    void security(String str);

    void killer(String str);
}

class Dog implements types {
    // Interface should always be implemented in a seperate class
    public void friendly(String breed) {
        System.out.println(breed + "is a very friendly dog");
    }

    public void security(String breed) {
        System.out.println(breed + "is used for security purposes");
    }

    public void killer(String breed) {
        System.out.println(breed + "is a killer dog");
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our shop");
        System.out.println("What kind of breed you're looking for?");
        String breed = sc.nextLine();
        Dog ob = new Dog();
        switch (breed) {
            case "Labrador":
                ob.friendly(breed);
                break;
            case "PitBull":
                ob.killer(breed);
                break;
            default:
                System.out.println("The dog breed that you are looking for is not found here");
                break;
        }
        sc.close();
    }
}
