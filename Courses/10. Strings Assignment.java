import java.util.*;

public class Practice2Assignment {

    public static void countvowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char cha = str.charAt(i);
            if (isVowel(cha)) {
                count++;
            }
        }
        System.out.println("Lower Case Vowels : " + count);
    }

    public static boolean isVowel(char ch) {
        char vow[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < vow.length; i++) {
            if (ch == vow[i]) {
                return true;
            }
        }
        return false;
    }

    public static void anagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char str1arr[] = str1.toCharArray();
        char str2arr[] = str2.toCharArray();

        if (Arrays.equals(str1arr, str2arr)) {
            System.out.print("'" + str1 + "' and '" + str2 + "' are Anagrams\n");
        } else
            System.out.print("'" + str1 + "'" + " and " + "''" + str2 + "'are not Anagrams.\n");

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Count how many times lowercase vowels occurred in a String entered by the\n" + "user.");
            System.out.println("Anagrams");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            // Consume the newline character left in the input buffer after reading the
            // integer
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the String");
                    String str1 = sc.nextLine();
                    countvowels(str1);
                    break;
                case 2:
                    System.out.println("Enter the 2 Strings");
                    String str2 = sc.next();
                    String str3 = sc.next();
                    anagrams(str2, str3);
                    break;
            }
        }
        sc.close();
    }
}