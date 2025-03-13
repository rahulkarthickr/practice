class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

// Single Inheritance: Dog inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance: Puppy extends from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Hierarchical Inheritance: Cat inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Multiple Inheritance using Interface
interface Pet {
    void friendly();
}

class GermanShepherd extends Dog implements Pet {
    public void friendly() {
        System.out.println("German Shepherd is friendly");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Puppy p = new Puppy();
        dog.eat();
        dog.bark();
        System.out.println();
        p.eat();
        p.weep();
        System.out.println();
        Cat c = new Cat();
        c.eat();
        c.meow();
        System.out.println();
        GermanShepherd gs = new GermanShepherd();
        gs.eat();
        gs.bark();
        gs.friendly();
    }
}
