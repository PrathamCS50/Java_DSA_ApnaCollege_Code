/*
 * Print Letters of the word
 * Palindrome
 * SubString
 * largest string in an array of fruits
 * Shortest Path
 * String Builder
 * Compression
 * Anagrams
 * Count Vowels
 */

import java.util.*;

public class Practice2 {

    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean ispalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i <= (str.length() / 2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }

    public static String substrings(int si, int ei, String str) {
        if (si < 0 || ei > str.length() || si > ei) {
            System.out.println("INvalid Substring");
            return str;
        }
        for (int i = si; i <= ei; i++) {
            System.out.print(str.charAt(i));
        }
        return str;
    }

    // public static String substring(int si, int ei, String str) {
    // if (si < 0 || ei > str.length() || si > ei) {
    // System.out.println("Invalid Substring");
    // return "Invalid";
    // }

    // StringBuilder sub = new StringBuilder("");
    // for (int i = si; i <= ei; i++) {
    // sub.append(str.charAt(i));
    // }
    // // sub = new StringBuilder(sub.toString()); // Assign the result back to sub
    // System.out.println(sub);
    // return str;
    // }

    public static void shortestPath(String str) {
        str = str.toUpperCase();
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir != 'N' && dir != 'W' && dir != 'S' && dir != 'E') {
                System.out.println("Invalid direction: " + dir);
                return;
            }
            if (dir == 'W')
                x--;
            if (dir == 'E')
                x++;
            if (dir == 'N')
                y++;
            if (dir == 'S')
                y--;

        }
        System.out.println("Shortest Distance : " + Math.sqrt((x * x) + (y * y)));
    }

    public static String largestString(String[] strings) {
        if (strings == null || strings.length == 0) {
            return null;
        }
        String max = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].compareToIgnoreCase(max) > 0) {
                max = strings[i];
            }
        }
        return max;
    }

    public static void compression(String str) {
        String newstr = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += Integer.toString(count);
            }
            count = 1; // Reset count for the next character
        }
        System.out.println(newstr);
        System.out.println();
    }

    public static void anagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not Anagrams.");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("'" + str1 + "' and '" + str2 + "' are Anagrams.");
        } else {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not Anagrams.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter 1 for printing letters,");
            System.out.println("enter 2 to check if a palindrome or not.");
            System.out.println("Enter 3 for substring ");
            System.out.println("Enter 4 to find the largest string");
            System.out.println("5. Substring Approach 2");
            System.out.println("Enter 6 for shortest Path.");
            System.out.println("7. Largest String of Letters");
            System.out.println("Enter 8 for Compression.");
            System.out.println("Enter 9 for anagrams");
            System.out.println("Enter 10 to count vowels.");
            System.out.println("Press 11 to Exit.");
            System.out.println("\nEnter Choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a String");
                    String str = sc.next();
                    printletters(str);
                    break;
                case 2:
                    System.out.println("Enter a String");
                    String str2 = sc.next();
                    System.out.println("The given string is Palindrome : " + ispalindrome(str2));
                    break;
                case 3:
                    System.out.println("Enter a String");
                    String str3 = sc.next();
                    System.out.println("Enter starting and ending index also");
                    int si = sc.nextInt();
                    int ei = sc.nextInt();
                    String substringResult = substrings(si - 1, ei - 1, str3);
                    System.out.println(substringResult); // Use the returned value correctly
                    break;
                case 5:
                    System.out.println("Enter a String");
                    String str4 = sc.next();
                    System.out.println("Enter starting and ending index also");
                    int si2 = sc.nextInt();
                    int ei2 = sc.nextInt();
                    String substringResult2 = substrings(si2, ei2, str4);
                    System.out.println(substringResult2); // Use the returned value correctly
                    break;
                case 6:
                    System.out.println("Enter directions like N,W,S,E");
                    String dis = sc.next();
                    shortestPath(dis);
                    break;
                case 7:
                    System.out.println("Enter the number of strings strings.");
                    int nos = sc.nextInt();
                    String string[] = new String[nos];
                    for (int i = 0; i < nos; i++) {
                        string[i] = sc.next();
                    }
                    System.out.println("Largest String is : " + largestString(string));
                    break;
                case 8:
                    System.out.println("Enter a String");
                    String str8 = sc.next();
                    compression(str8);
                    break;
                case 9:
                    System.out.println("Enter 2 strings");
                    String str91 = sc.next();
                    String str92 = sc.next();
                    anagrams(str91, str92);
                    break;
                case 11:
                    exit = true;
                    break;
                default:
                    System.out.println("InVALILD ChOIcE");
                    break;
            }
        }
        sc.close();
    }
}
