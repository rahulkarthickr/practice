public class CloneMeth implements Cloneable {
    int a;

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneMeth ob = new CloneMeth();
        ob.a = 100;
        System.out.println("Object1 before clone:" + ob.a);
        CloneMeth ob1 = (CloneMeth) ob.clone();
        System.out.println("Object2 before clone:" + ob1.a);
        ob.a = 300;
        System.out.println("Object1 after clone:" + ob.a);
        System.out.println("Object2 after clone:" + ob1.a);
    }
}
