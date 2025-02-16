package Leetcode;

import java.math.BigInteger;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = addBinary(a, b);
        System.out.println(c);
        sc.close();
    }

    public static String addBinary(String a, String b) {
        BigInteger c = new BigInteger(a, 2);
        BigInteger d = new BigInteger(b, 2);
        BigInteger e = c.add(d);
        return e.toString(2);
    }
}
