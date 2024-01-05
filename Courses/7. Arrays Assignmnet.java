// Q1
// Q2       --RRRRRR -- REVISE
// Q3
// Q4       --RRRRRR -- REVISE
// Q5

import java.util.*;

public class Practice2Assignment {

    public static void containsduplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Contains Duplicate");
                    return;
                }
            }
        }
        System.out.println("No duplicacy");
    }

    public static int searchMin(int arr[]) {
        int min = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int search(int nums[], int target) {
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int mid = right + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[left] < nums[mid]) {
                if (nums[left] > target && nums[mid] > target)
                    right = mid + 1;
                else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int buysellstocks(int prices[]) {
        int bp = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < bp) {
                bp = prices[i];
            } else {
                int profit = Math.abs(prices[i] - bp);
                maxprofit = Math.max(profit, maxprofit);
            }
        }
        return maxprofit;
    }

    public static void trappingrainwater(int arr[]) {
        int n = arr.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
        }
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
        }
        int width = 1;
        int trappedrainwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedrainwater += (waterlevel - arr[i]) * width;
        }
        System.out.println("Trapped RainWater is : " + trappedrainwater);
    }

    public static void triplets(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i != j && i != k && j != k) {
                        if (arr[i] + arr[j] + arr[k] == 0) {
                            System.out.print(arr[i] + " , " + arr[j] + " , " + arr[k]);
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println(
                    "Q1. Given an integer array nums, return true if any value appears at least twice in the \r\n" + //
                            "array, and return false if every element is distinct");
            System.out.println(
                    "Q2. There is an integer array nums sorted in ascending order (with distinct values).\r\n" + //
                            "Prior to being passed to your function, nums is possibly rotated at an unknown \r\n" + //
                            "pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], \r\n" + //
                            "nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For \r\n" + //
                            "example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and \r\n" + //
                            "become [4,5,6,7,0,1,2].\r\n" + //
                            "Given the array nums after the possible rotation and an integer target, return the \r\n" + //
                            "index of target if it is in nums, or -1 if it is not in nums.\r\n" + //
                            "You must write an algorithm with O(log n) runtime complexity.");

            System.out
                    .println("Q3. You are given an array prices where prices[i] is the price of a given stock on \r\n" + //
                            "the i\r\n" + //
                            "th day.\r\n" + //
                            "Return the maximum profit you can achieve from this transaction. If you cannot \r\n" + //
                            "achieve any profit, return 0");
            System.out.println(
                    "Q4.  Given n non-negative integers representing an elevation map where the width of \r\n" + //
                            "each bar is 1, compute how much water it can trap after raining");

            System.out.println("Q5.  Given an integer array nums, return all the triplets [nums[i], nums[j], \r\n" + //
                    "nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.\r\n" + //
                    "Notice that the solution set must not contain duplicate triplets.");
            System.out.println("Q6. FINDING THE INDEX XOF THE SMALLEST ELEMENT");
            System.out.println("7. EXIT");

            System.out.println("Enter choice");
            int choice = sc.nextInt();
            int arr1[] = { 1, 2, 3, 1, 5, 8, 6, 7, 4 };
            int arr3[] = { 7, 1, 5, 3, 6, 4 };
            int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
            int arr5[] = { -1, 0, 1, 2, -1, -4 };

            switch (choice) {
                case 1:
                    // check for duplicates in an array
                    containsduplicate(arr1);
                    break;
                case 2:
                    System.out.println("Advanced Binary Search");
                    System.out.println("Enter the target whose index u wanna find.");
                    int target = sc.nextInt();
                    search(arr1, target);
                    break;
                case 3:
                    System.out.println("BUY AND SELL STOCKS.");
                    System.out.println("Maximum Profit is : " + buysellstocks(arr3));
                    break;
                case 4:
                    System.out.println("Trapping Rainwater");
                    trappingrainwater(height);
                    break;
                case 5:
                    System.out.println("TRIPLETS");
                    triplets(arr5);
                    break;
                case 6:
                    System.out.println("Index of smallest element is : " + searchMin(arr1));
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
        sc.close();
    }
}
