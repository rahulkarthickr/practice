import java.util.ArrayList;
import java.util.Iterator;

public class Itratr {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(20);
        ob.add(30);
        ob.add(40);
        System.out.println("Before while:" + ob);
        Iterator i = ob.iterator();
        while (i.hasNext()) {
            Integer a = (Integer) i.next();
            if (a.equals(20)) {
                i.remove();
            }
        }
        System.out.println("After while:" + ob);
    }
}
