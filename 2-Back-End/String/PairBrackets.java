public class PairBrackets {
    public static void main(String[] args) {
        String s = "(()()))";
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == '(' && c[i + 1] == ')') {
                count += 2;
            }
        }
        System.out.println(count);
    }
}
