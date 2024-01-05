//Function Overloading
//Binary to Decimal
//Decimal to Binary
//Prime number 
//Primes in Range
//Binomial expansion
//Swapping 2 numbers via 1 and no variable
//Sum of digits

import java.util.*;

public class Practice2 {

    public static int binaryToDecimal(long n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            dec = dec + (int) ((n % 10) * Math.pow(2, pow));
            n /= 10;
            pow++;
        }
        return dec;
    }

    public static long decimaltobinary(int n) {
        int pow = 0;
        long bin = 0;
        while (n > 0) {
            bin = bin + (long) ((n % 2) * Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        return bin;
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void range(int lr, int ur) {
        for (int i = lr; i <= ur; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static float binomialExpression(int n, int r) {
        return ((factorial(n)) / (factorial(r) * factorial(n - r)));
    }

    public static void swapNumbers(double a, double b) {
        // a=10
        // b=5
        System.out.println("Number 1 : " + a);
        System.out.println("Number 2 : " + b);
        System.out.println("\1\2\3\4");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Number 1 : " + a);
        System.out.println("Number 2 : " + b);
    }

    public static int sumofdigits(long n) {
        int ans = 0;
        while (n > 0) {
            ans = ans + (int) (n % 10);
            n /= 10;
        }
        return ans;
    }

    public static boolean isPalindrome(long n) {
        System.out.println("ORG : " + n);
        long org = n;
        long rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        System.out.println(rev);
        if (rev == org) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter the operation you want to perform:");
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Decimal to Binary");
            System.out.println("3. Prime Number");
            System.out.println("4. Primes in Range");
            System.out.println("5. Binomial Expansion");
            System.out.println("6. Swapping 2 numbers");
            System.out.println("7. Sum of Digits");
            System.out.println("8. PALINDROME");
            System.out.println("9. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("BINARY TO DECIMAL");
                    System.out.println("ENTER THE BINARY NUMBER ONLY");
                    long bin = sc.nextLong();
                    System.out.println(binaryToDecimal(bin) + "\n");
                    break;
                case 2:
                    System.out.println("DECIMAL TO BINARY");
                    System.out.println("ENTER THE DECIMAL NUMBER");
                    int dec = sc.nextInt();
                    System.out.println(decimaltobinary(dec) + "\n");
                    break;
                case 3:
                    System.out.println("PRIME CHECKER ");
                    System.out.print("Enter a positive number : ");
                    int pr = sc.nextInt();
                    if (pr > 0) {
                        if (isPrime(pr)) {
                            System.out.println("\"" + pr + "\" is prime.");
                        } else {
                            System.out.println("\"" + pr + "\" not prime!");
                        }
                    } else {
                        System.out.println("Enter a positive number");
                    }
                    break;
                case 4:
                    System.out.println("PRIMES IN RANGE:");
                    System.out.println("Enter the lower range");
                    int lr = sc.nextInt();
                    System.out.println("Enter the upper range");
                    int ur = sc.nextInt();
                    range(lr, ur);
                    break;
                case 5:
                    System.out.println("BINOMIAL EXPANSION");
                    System.out.println("Enter only positive values");
                    System.out.println("Enter n value for Binomial Expansion");
                    int n = sc.nextInt();
                    System.out.println("Enter r value for binomial expansion");
                    int r = sc.nextInt();
                    System.out.println(binomialExpression(n, r));
                    break;
                case 6:
                    System.out.println("SWAPPING 2 NUMBERS");
                    System.out.println("Enter number 1: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Enter number 2: ");
                    double n2 = sc.nextDouble();
                    swapNumbers(n1, n2);
                    break;
                case 7:
                    System.out.println("SUM OF DIGITS");
                    System.out.println("Enter a number");
                    long num = sc.nextLong();
                    System.out.println("Sum of Digits of " + num + " : " + sumofdigits(num));
                    break;
                case 8:
                    System.out.println("PALINDROME");
                    System.out.println("Enter the numebr to check");
                    long pld = sc.nextLong();
                    if (isPalindrome(pld)) {
                        System.out.print("" + pld + " is palindromic.\n");
                    } else {
                        System.out.print("" + pld + " not palindromic!!\n");
                    }
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    exit = true;
                    break;
            }
        }
        sc.close();
    }
}