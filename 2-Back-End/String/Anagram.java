import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String s1 = sc.nextLine();
        System.out.println("Enter string 2:");
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("Not an Anagram");
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
        sc.close();
    }
}
