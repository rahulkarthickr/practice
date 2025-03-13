import java.util.Arrays;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ObjectClass {
    public String toString() {
        return "ObjectClass";
    }

    public static void main(String[] args) {
        String str = "Hello";
        String str1 = new String("Hello");
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        ObjectClass ob = new ObjectClass();
        System.out.println(ob);
        ObjectClass ob1 = new ObjectClass();
        System.out.println(ob1);
        Student ar[] = new Student[2];
        ar[0] = new Student(1, "A");
        ar[1] = new Student(2, "B");
        System.out.println(Arrays.toString(ar));
        Student t = ar[0];
        System.out.println(t.id);
        System.out.println(ar[1].id);
        System.out.println(ob.getClass());
        System.out.println(t.getClass());
        System.out.println(str.getClass());
    }
}
