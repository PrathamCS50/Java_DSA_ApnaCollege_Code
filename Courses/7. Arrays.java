//Reverse an array
//Binary Search
//Linear Search
// Update marks
//Buy Sell Stocks
//Smallest and Largest in array
//Maximim Sub Array Sum     ////RRRRRRRR-REVISE
//Pairs
// Kadanes Rule             ////RRRRRRRR-REVISE
//Prefix Sub Array Sum      ////RRRRRRRR-REVISE
// Trapping RainWater       ////RRRRRRRR-REVISE
//Sub Array and Sum

import java.util.*;

public class Practice2 {
    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int arrLength = sc.nextInt();
        System.out.println("Enter elements randomly:");
        int arr[] = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void printArray(int arr[]) {
        if (arr == null || arr.length <= 0) {
            return;
        } else {
            for (int element : arr)
                System.out.print(element + " ");
        }
    }

    public static void reversearray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Element found at index " + i + " in array.");
            }
        }
    }

    public static void binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        Arrays.sort(arr);
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("FOUND at index: " + mid);
                return;
            }
            if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        System.out.println("NOT FOUND");
    }

    public static void buysellstock(int arr[]) {
        int bp = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (bp < arr[i]) {
                int profit = arr[i] - bp;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                bp = arr[i];
            }
        }
        System.out.println("MAX PROFIT : " + maxprofit);
    }

    public static void smallestlargestinanarray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);
    }

    public static void pairs(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(arr[i] + " , " + arr[j] + " \t\t");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs : " + count);
    }

    public static void maxsubarraysum(int arr[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                curr = 0;
                for (int k = i; k <= j; k++) {
                    curr += arr[k];
                }
                if (max < curr) {
                    max = curr;
                    start = i;
                    end = j;
                }
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Maximum sum is : " + max);
    }

    /*
     * You are given an array height representing the heights of walls along a city
     * street. The width of each wall is the same, and you are also given the width
     * as an integer width. The trappingrainwater function is designed to calculate
     * how much rainwater can be trapped between the walls. Implement the
     * trappingrainwater function according to the given code.
     * 
     * Task:
     * 
     * Complete the trappingrainwater function to calculate the trapped rainwater
     * based on the heights of the walls and the given width.
     * 
     * The function should return the total trapped rainwater.
     * 
     * Test the function with the provided height array, and print the result.
     */
    public static void trappingrainwater(int arr[], int width) {
        int n = arr.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        // Getting left Array
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }
        printArray(leftmax);
        System.out.println();

        // Getting Right Array
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
        }
        printArray(rightmax);

        // Logic
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            trappedwater += (waterlevel - arr[i]) * width;
        }
        System.out.println("Trapped RainWater is : " + trappedwater);
    }

    public static void prefixsubarraysum(int arr[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        printArray(prefix);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            // start=i;
            for (int j = i + 1; j < arr.length; j++) {
                // end=j;
                curr = 0;
                curr = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (curr > max) {
                    max = curr;
                }
            }
        }
        System.out.println("MAX SUm : " + max);
    }

    public static void kadanesalgorithm(int arr[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible value
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if (curr < 0) {
                curr = 0;
            }
            max = Math.max(curr, max);
        }
        System.out.println("Max sum is = " + max);
    }

    public static void subarraysum(int arr[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                curr = 0;
                for (int k = i; k <= j; k++) {
                    curr += arr[k];
                }
                if (max < curr) {
                    max = curr;
                    start = i;
                    end = j;
                }
                for (int l = start; l <= end; l++) {
                    System.out.print(arr[l] + " ");
                }
                System.out.println("Current sum is " + curr);
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Maximum sum is : " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nEnter the Choice you want to do:");
            System.out.println("1. REVERSE AN ARRAY");
            System.out.println("2. LINEAR SEARCH");
            System.out.println("3. BINARY SEARCH");
            System.out.println("4. BUY SELL STOCKS");
            System.out.println("5. SMALLEST AND LARGEST IN AN ARRAY");
            System.out.println("6. MAXIMUM SUBARRAY SUM ");
            System.out.println("7. PAIRS");
            System.out.println("8. TRAPPING RAWNWATER");
            System.out.println("9. PREFIX SUB ARRAY SUM");
            System.out.println("10. KADANES ALGORITHM");
            System.out.println("11.SUB ARRAY AND SUM");
            System.out.println("12.EXIT");
            int choice = sc.nextInt();
            int arr1[] = { -5, -3, -1, 1, 3, 5, 7 };
            int karr1[] = { -5, -3, -1, -1, -3, -5, -7 };
            int arr2[] = { 1, 4, 3, 7, 5 };
            int height[] = { 4, 2, 0, 6, 3, 2, 5 };

            switch (choice) {
                case 1:
                    System.out.println("REVERSE AN ARRAY");
                    reversearray(arr1);
                    printArray(arr1);
                    break;
                case 2:
                    System.out.println("LINEAR SEARCH");
                    System.out.println("Enter key");
                    int key1 = sc.nextInt();
                    linearSearch(arr2, key1);
                    break;
                case 3:
                    System.out.println("BINARY SEARCH");
                    System.out.println("Enter key");
                    int key2 = sc.nextInt();
                    binarysearch(arr2, key2);
                    break;
                case 4:
                    System.out.println("BUY AND SELL STOCKS");
                    buysellstock(arr2);
                    break;
                case 5:
                    System.out.println("SMALLEST AND LARGEST IN AN ARRAY");
                    smallestlargestinanarray(arr1);
                    break;
                case 6:
                    System.out.println("MAX SUB ARRAY SUM");
                    maxsubarraysum(arr1);
                    break;
                case 7:
                    System.out.println("PAIRS");
                    pairs(arr1);
                    break;
                case 8:
                    System.out.println("TRAPPING RAINWATER");
                    System.out.println("Enter width");
                    int width = sc.nextInt();
                    trappingrainwater(height, width);
                    break;
                case 9:
                    System.out.println("PREFIX SUBARRAY SUM");
                    prefixsubarraysum(arr1);
                    break;
                case 10:
                    System.out.println("Kadanes algorithm");
                    kadanesalgorithm(karr1);
                    break;
                case 11:
                    System.out.println("SUB ARRAY AND SUM");
                    subarraysum(arr2);
                case 12:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
        sc.close();
    }
}
