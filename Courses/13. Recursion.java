// PRINT DECREASING AND INCREASING NUMBERS 
// FACTORIAL
// SUM OF N NUMBERS
// FIBBONACCI SERIES
// FIRST AND LAST OCCURENCE IN AN ARRAY
// SORTING OF ARRAY
// POWER ( X^N )

import java.util.*;

public class Practice2 {
    public static void dec(int n) {
        if (n == 1)
            System.out.println(1);
        else {
            System.out.print(n);
            dec(n - 1);
        }
    }

    public static void inc(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        inc(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumofn(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumofn(n - 1);
    }

    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void firstOccurence(int key, int arr[], int i) {
        if (i >= arr.length) {
            System.out.println("Not Found");
            return;
        }
        if (key == arr[i]) {
            System.out.println("Found at Index: " + i);
            return;
        }
        firstOccurence(key, arr, i + 1);
    }

    public static void lastOccurence(int key, int arr[], int i) {
        if (i < 0) {
            System.out.println("Not Found");
            return;
        }
        if (key == arr[i]) {
            System.out.println("Last Occurrence is " + i);
            return;
        }
        lastOccurence(key, arr, i - 1);
    }

    public static void issorted(int arr[], int i) {
        if (i >= arr.length - 1) {
            System.out.println("Sorted");
            return;
        }

        if (arr[i] >= arr[i + 1]) {
            System.out.println("Not Sorted");
            return;
        }

        issorted(arr, i + 1);
    }

    public static long power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("Enter the number of operations you want to perform:");
            System.out.println("1. PRINT DECREASING AND INCREASING NUMBERS ");
            System.out.println("2. FACTORIAL");
            System.out.println("3. SUM OF N NUMBERS");
            System.out.println("4. FIBBONACCI SERIES");
            System.out.println("5. FIRST AND LAST OCCURENCE IN AN ARRAY");
            System.out.println("6. SORTING OF ARRAY");
            System.out.println("7. POWER ( X^N )");
            System.out.println("Enter the choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\nEnter a number");
                    int n1 = sc.nextInt();
                    System.out.println("\nDecreasing Order:");
                    dec(n1);
                    System.out.println("\nIncreasing Order:");
                    inc(n1);
                    break;
                case 2:
                    System.out.println("\nEnter a number ");
                    int num2 = sc.nextInt();
                    System.out.print("Factorial is :" + factorial(num2));
                    break;
                case 3:
                    System.out.println("Enter a number");
                    int num3 = sc.nextInt();
                    System.out.println("Sum of first " + num3 + " numbers is : " + sumofn(num3));
                    break;
                case 4:
                    System.out.println("Enter a number");
                    int num4 = sc.nextInt();
                    System.out.println(num4 + "th number is : ");
                    System.out.println(fibonacci(num4));
                    System.out.println("Fibonacci Series : ");
                    printFibonacciSeries(num4);
                    break;
                case 5:
                    int arr5[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 6, 8 };
                    System.out.println("Enter the key");
                    int num5 = sc.nextInt();
                    firstOccurence(num5, arr5, 0);
                    lastOccurence(num5, arr5, arr5.length);
                    break;
                case 6:
                    int arr6[] = { 1, 2, 3, 4, 5, 6 };
                    issorted(arr6, 0);
                    break;
                case 7:
                    System.out.println("Enter x to the power on n");
                    int x = sc.nextInt();
                    int n = sc.nextInt();
                    System.out.println("Answer is : " + power(x, n));
                    break;
                default:
                    System.exit(-1);
            }
        }
        sc.close();
    }
}
