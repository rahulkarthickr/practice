import java.util.Arrays;

public class StringBuffBuild {

    public static void main(String[] args) {
        StringBuffer sbuffer = new StringBuffer("Java");
        StringBuilder sbuild = new StringBuilder("Hello");
        System.out.println(sbuffer);
        System.out.println(sbuild);
        sbuild = new StringBuilder("Welcome");
        System.out.println(sbuild);
        // .append()
        sbuffer.append(" programming lang");
        System.out.println(sbuffer);
        // .concat()
        String s = "java";
        s.concat(" program");
        System.out.println(s);
        // .insert()
        sbuffer.insert(5, "is a ");
        System.out.println(sbuffer);
        // .delete()
        sbuffer.delete(5, 9);
        System.out.println(sbuffer);
        // .replace()
        sbuffer.replace(0, 4, "C");
        System.out.println(sbuffer);
        // .reverse()
        sbuffer.reverse();
        System.out.println();
        System.out.println(sbuffer);
        // .deleteCharAt()
        sbuffer.deleteCharAt(0);
        System.out.println(sbuffer);
        // .toString()
        String s1 = sbuild.toString();
        // .split()
        System.out.println(Arrays.toString(s1.split(" ")));
        String ar[] = sbuffer.toString().split(" ");
        System.out.println(Arrays.toString(ar));
    }
}
