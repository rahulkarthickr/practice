import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat(); // When we input 'int', it will be typecasted as 'float'
        System.out.println(num);
        sc.close();
    }
}