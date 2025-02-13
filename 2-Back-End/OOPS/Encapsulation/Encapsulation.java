class Person {
    String name;

    // Setter Method
    public void setName(String name) {
        this.name = name;
    }

    // Getter Method
    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rahul");
        System.out.println("Person's Name:" + p.getName());
    }
}