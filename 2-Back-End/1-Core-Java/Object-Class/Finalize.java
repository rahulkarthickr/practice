public class Finalize {
    int a = 10;

    void demo() {
        // Finalize ob = new Finalize();
        System.out.println("Hello");
    }

    public void finalize() {
        System.out.println("GC Calling............");
    }

    public static void main(String[] args) {
        Finalize ob = new Finalize();
        ob = null; // Nulling object reference
        Finalize ob1 = new Finalize();
        ob = ob1; // Reassigning object reference
        System.out.println(ob.a);
        System.out.println(ob1.a);
        new Finalize();// Anonymous Object
        ob1.demo();// Object created inside method
        System.gc();
    }
}
