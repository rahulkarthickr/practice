public class Permutations {
    public static void main(String[] args) {
        String s = "XYZ";
        char[] c = s.toCharArray();
        permute(c, 0);
    }

    public static void permute(char[] c, int start) {
        if (start == c.length - 1) {
            System.out.println(new String(c));
            return;
        }
        for (int i = start; i < c.length; i++) {
            char temp = c[start];
            c[start] = c[i];
            c[i] = temp;
            permute(c, start + 1);
            temp = c[start];
            c[start] = c[i];
            c[i] = temp;
        }
    }
}
