import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        // .add()
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        // .size()
        System.out.println(a1.size());
        // .remove()
        a1.remove(0);
        // .addAll()
        a2.add(100);
        a2.add(200);
        a2.add(300);
        a2.addAll(a1);
        System.out.println(a2);
        // .removeAll()
        a1.removeAll(a1);
        // .retainAll()
        a1.retainAll(a1);
        // .clear()
        a1.clear();
        // .isEmpty()
        System.out.println(a2.isEmpty());
        a2.add(111);
        a2.add(222);
        // .contains()
        System.out.println(a2.contains(111));
        // .containsAll()
        System.out.println(a2.containsAll(a1));
        // .indexOf()
        System.out.println(a2.indexOf(200));
        System.out.println(a2.lastIndexOf(200));
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        for (Object a : a1) {
            System.out.println(a);
        }
    }
}
