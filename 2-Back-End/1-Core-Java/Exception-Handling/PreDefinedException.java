public class PreDefinedException {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }
        // ArrayIndexOutOfBoundsException
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index is out of bounds.");
        }
        // NumberFormatException
        try {
            String invalidNumber = "abc";
            int number = Integer.parseInt(invalidNumber);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format.");
        }
    }
}
