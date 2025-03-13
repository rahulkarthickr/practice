import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter temperature in celcius:");
        float celcius = sc.nextFloat();
        float farenheit = (celcius * 9 / 5) + 32;
        System.out.println("Given temperature in farenheit:" + farenheit);
        sc.close();
    }
}