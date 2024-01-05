/*
 * Odd Even
 * Get ith bit
 * Set ith Bit
 * Cleear ith bit 
 * Update ith bit
 * Clear ith bit
 * clear i bits
 * No. is power of 2
 * Clear range of bits      -------RRREEEVVVIIISSSEEE
 * Count set bits
 * Fast exponential         -------RRREEEVVVIIISSSEEE
 * Assignment Questions
 * 1. x ^ x
 * 2.
 * 3.
 * 4.
 */

import java.util.*;

public class Practice2 {
    public static int dectobin(int n) {
        int dec = 0;
        while (n > 0) {
            dec = dec * 10 + (n % 2);
            n /= 2;
        }
        return dec;
    }

    public static void oddEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public static int getithbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearithbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateithbit1(int n, int i, int newbit) { // Problem
        if (newbit == 0) {
            return clearithbit(n, i);
        } else {
            return setithbit(n, i);
        }
    }

    public static int updateithbit2(int n, int i, int newbit) {
        n = clearithbit(n, i);
        int bitmask = newbit << i;
        return bitmask | n;
    }

    public static int clearibits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static void isPowerof2(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println("This no. is power of 2.");
        } else {
            System.out.println("NOT");
        }
    }

    public static int clearRangeIBits(int n, int i, int j) {
        int a = ((~0 << j + 1));
        int b = (1 << i - 1);
        int bitmask = a | b;
        return n & bitmask;
    }

    public static int countsetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
        // return Integer.bitCount(n);
    }

    public static int FastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = a * ans;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    public static void swapnumbers(int a, int b) {
        System.out.println("Before swap \n a = " + a + "\n b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("\nAfter swap \n a = " + a + "\n b = " + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("/n Enter the choice....");
            System.out.println("1. Odd Even number.");
            System.out.println("2. Get the ith Bit.");
            System.out.println("3. Set the ith Bit.");
            System.out.println("4. Clear the ith Bit.");
            System.out.println("5. Update the ith Bit.");
            System.out.println("6. Clear i bits.");
            System.out.println("7. Check if the number is power of 2 .");
            System.out.println("8. clear Range of i bits.");
            System.out.println("9. Count Set Bits.");
            System.out.println("10. Fast Exponential a^n");
            System.out.println("11. x XOR x ");
            System.out.println("12. Swaping 2 Numbers.");
            System.out.println("13. Negation of a number");
            System.out.println("14. Convert uppercase characters to lowercase using bits");
            System.out.println("16. EXIT");
            System.out.println("\nEnter the choice \n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Odd Even number.");
                    System.out.println("Enter the number.");
                    int c1 = sc.nextInt();
                    dectobin(c1);
                    oddEven((c1));
                    break;
                case 2:
                    System.out.println("Get the ith Bit.");
                    System.out.println("Enter the number");
                    int n2 = sc.nextInt();
                    dectobin(n2);
                    System.out.println("Which bit ");
                    int c2 = sc.nextInt();
                    System.out.println("The bit is ");
                    System.out.println(getithbit(n2, c2));
                    // getithbit(n2, c2);
                    break;
                case 3:
                    System.out.println("Set the ith Bit.");
                    System.out.println("Enter the number");
                    int n3 = sc.nextInt();
                    dectobin(n3);
                    System.out.println("Which bit ");
                    int c3 = sc.nextInt();
                    setithbit(n3, c3);
                    System.out.println("New Number is ");
                    System.out.println(dectobin(setithbit(n3, c3)));
                    break;
                case 4:
                    System.out.println("Clear the ith Bit.");
                    System.out.println("Enter the number");
                    int n4 = sc.nextInt();
                    dectobin(n4);
                    System.out.println("Which bit ");
                    int c4 = sc.nextInt();
                    clearithbit(n4, c4);
                    System.out.println("New Number is ");
                    System.out.println(dectobin(clearithbit(n4, c4)));
                    break;
                case 5:
                    System.out.println("Update the ith Bit.");
                    System.out.println("Enter the number");
                    int n5 = sc.nextInt();
                    dectobin(n5);
                    System.out.println("Which bit ");
                    int c5 = sc.nextInt();
                    System.out.println("Enter new bit - 0 | 1 .");
                    int newbit5 = sc.nextInt();
                    System.out.println("Method 1 ");
                    System.out.println("New number is ");
                    System.out.println(updateithbit1(n5, choice, newbit5));

                    System.out.println("/nMethod 2");
                    System.out.println("New number is ");
                    System.out.println(updateithbit2(n5, c5, newbit5));
                    break;
                case 6:
                    System.out.println("Clear i bits.");
                    System.out.println("Enter the number");
                    int n6 = sc.nextInt();
                    dectobin(n6);
                    System.out.println("How many bits ");
                    int c6 = sc.nextInt();
                    System.out.println("New number is ");
                    System.out.println(clearibits(n6, c6));
                    break;
                case 7:
                    System.out.println("Number is power of 2 ");
                    System.out.println("Enter the number");
                    int n7 = sc.nextInt();
                    dectobin(n7);
                    isPowerof2(n7);
                    break;
                case 8:
                    System.out.println("Clear Range of i bits.");
                    System.out.println("Enter the number");
                    int n8 = sc.nextInt();
                    dectobin(n8);
                    System.out.println("Enter range.");
                    int c81 = sc.nextInt();
                    int c82 = sc.nextInt();
                    System.out.println(clearRangeIBits(n8, c81, c82));
                    break;
                case 9:
                    System.out.println("Count set Bits");
                    System.out.println("Enter the number");
                    int n9 = sc.nextInt();
                    dectobin(n9);
                    System.out.println("The number of 1's in this are : ");
                    System.out.println(countsetBits(n9));
                    break;
                case 10:
                    System.out.println("Fast Exponential a^n");
                    System.out.println("Enter a and n");
                    int n10 = sc.nextInt();
                    int c10 = sc.nextInt();
                    System.out.println("The answer is ");
                    System.out.println(FastExpo(n10, c10));
                    break;

                case 11:
                    System.out.println("X XOR X");
                    System.out.println(
                            "xor gives 0 when the bits are the same. If we compare the same number to itself, the bits will always be the same. So, the answer of x^x will always be 0");
                    break;
                case 12:
                    System.out.println("Swap 2 numbers");
                    System.out.println("Enter 2 numbers.");
                    int n121 = sc.nextInt();
                    int n122 = sc.nextInt();
                    swapnumbers(n121, n122);
                    break;
                case 13:
                    System.out.println("Negation");
                    System.out.println("Enter teh number");
                    int n13 = sc.nextInt();
                    System.out.println(n13 + " + 1 = " + ~(~n13));
                    break;
                case 14:
                    System.out.println("14. Convert uppercase characters to lowercase using bits");
                    for (char ch = 'A'; ch <= 'Z'; ch++) {
                        System.out.println((char) (ch | ' '));
                    }
                    break;
                case 15:
                    exit = true;
                    break;
                default:
                    System.exit(-1);
            }
        }
        sc.close();
    }
}