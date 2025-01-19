class Cons {
    String name;

    Cons() {
        this("Vicky");
        System.out.println("Non parameterized constructor");
    }

    Cons(String name) {
        this.name = name;
        System.out.println(name);
    }

    Cons(int num) {
        System.out.println(num);
    }
}

class Constructor extends Cons {
    Constructor(int num) {
        super(500);
    }

    public static void main(String[] args) {
        Cons ob = new Cons();
        System.out.println(ob.name);
        Cons obj = new Cons("Rahul");
        System.out.println(obj.name);
        Cons obj1 = new Cons(200);
        Constructor obj2 = new Constructor(200);
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}