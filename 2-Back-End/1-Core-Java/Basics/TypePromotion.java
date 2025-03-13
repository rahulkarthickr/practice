public class TypePromotion {
    public static void main(String[] args) {
        byte a = 42;
        byte b = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * a) + (i / b) - (d - s); // all variables are type promoted to 'double'
        System.out.println(result);
    }
}
