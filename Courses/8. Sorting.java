/*
 * Bubble Sort
 * Selection Sort
 * Insertion Sort
 * Counting Sort
 */

import java.util.*;

public class Practice2 {

    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements.");
        int ne = sc.nextInt();
        int arr[] = new int[ne];
        System.out.println("Enter elements");
        for (int i = 0; i < ne; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        int totalswap = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swaps = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    totalswap++;
                }
            }
            System.out.println("SWAPS in turn " + (turn + 1) + ": " + swaps);
        }
        System.out.println("Total Swaps : " + totalswap);
        System.out.println("Final Array : ");
        printArray(arr);
    }

    public static void selectionSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int smallest = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[turn];
            arr[turn] = temp;
        }
        System.out.println("Final Array : ");
        printArray(arr);
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        System.out.println("Final Array : ");
        printArray(arr);
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("Final Array : ");
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("0. GET ARRAY");
            System.out.println("1. BUBBLE SORT");
            System.out.println("2. SELECTION SORT");
            System.out.println("3. INSERTION SORT");
            System.out.println("4. COUNTING SORT");
            System.out.println("Enter any number to Exit");
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            int arr[] = { 4, 2, 3, 1, 5 };
            switch (choice) {
                case 0:
                    arr = getArray();
                    break;
                case 1:
                    bubbleSort(arr);
                    break;
                case 2:
                    selectionSort(arr);
                    break;
                case 3:
                    insertionSort(arr);
                    break;
                case 4:
                    countingSort(arr);
                    break;
                default:
                    exit = true;
                    break;
            }
        }
        sc.close();
    }
}