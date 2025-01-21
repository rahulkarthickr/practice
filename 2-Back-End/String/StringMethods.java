import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        // .length()
        String str = "Rahul Karthick";
        System.out.println(str.length());
        // .equals()
        String str1 = "Rahul";
        String str2 = "Karthick";
        System.out.println(str1.equals(str2));
        // .equalsIgnoreCase()
        String str3 = "Rahul";
        String str4 = "rahul";
        System.out.println(str3.equalsIgnoreCase(str4));
        // .concat()
        System.out.println(str1.concat(str2));
        // .charAt()
        System.out.println(str.charAt(4));
        // .indexOf()
        System.out.println(str.indexOf('K')); // Generally, methods are case-senstitive
        System.out.println(str.lastIndexOf('R'));
        // .toCharArray()
        char[] arr = str3.toCharArray();
        System.out.println(Arrays.toString(arr));
        // .split()
        String[] arr1 = str.split(" "); // spilts into array of substrings whenever there is a space between them
        System.out.println(Arrays.toString(arr1));
        // .toUpperCase()
        System.out.println(str4.toUpperCase());
        // .toLowerCase()
        System.out.println(str3.toLowerCase());
        // .startsWith()
        System.out.println(str.startsWith(str3));
        // .endsWith()
        System.out.println(str.endsWith(str2));
        // .contains()
        System.out.println(str.contains("R"));
        // .trim()
        String str5 = " Rahul Karthick ";
        System.out.println(str5.trim());
        // .substring()
        System.out.println(str.substring(4, 8));
        // .intern()
        String str6 = new String("Rahul");
        str6 = str6.intern(); // cretes a copy in SCP but the str6 is created in Heap
        System.out.println(str3 == str6);
        // .isBlank()
        String str7 = " ";
        System.out.println(str7.isBlank()); // checks for any characters ; neglects spaces
        // .isEmpty()
        System.out.println(str7.isEmpty()); // checks for the string is completely empty even without spaces
        // .replace()
        System.out.println(str.replace("Karthick", "Raja"));
        // .compareTo()
        System.out.println(str1.compareTo(str3)); // returns 0 if two strings are the same
        // .compareToIgnoreCase()
        System.out.println(str3.compareToIgnoreCase(str4)); // compares by ignoring case
    }
}