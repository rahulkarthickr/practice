public class BalancedParentheses {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isBalanced(s));
    }

    public static boolean isBalanced(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            int initialLength = sb.length();
            for (int i = 0; i < sb.length() - 1; i++) {
                if ((sb.charAt(i) == '(' && sb.charAt(i + 1) == ')') ||
                        (sb.charAt(i) == '{' && sb.charAt(i + 1) == '}') ||
                        (sb.charAt(i) == '[' && sb.charAt(i + 1) == ']')) {
                    sb.delete(i, i + 2);
                    break;
                }
            }
            if (sb.length() == initialLength) {
                break;
            }
        }
        return sb.length() == 0;
    }
}
