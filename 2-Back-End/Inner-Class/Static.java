public class Static {
    public static class Nested {
        public static void printMessage(String Message) {
            System.out.println(Message);
        }
    }

    public static void main(String[] args) {
        Static.Nested.printMessage("Hello");
    }
}
