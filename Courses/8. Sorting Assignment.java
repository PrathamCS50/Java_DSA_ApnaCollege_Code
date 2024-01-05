import java.util.*;

public class Practice2Assignment {

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

    public static void dbubbleSort(int arr[]) {
        int n = arr.length;
        int totalswaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;

            for (int j = 0; j < n - 1 - i; j++) { // Fixed the loop condition here
                if (arr[j] < arr[j + 1]) { // Changed to arr[j] < arr[j + 1] for descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    totalswaps++;
                }
            }

            System.out.println("Swaps in turn " + (i + 1) + ": " + swaps);
        }

        System.out.println("Total Swaps : " + totalswaps);
        System.out.println("Final Array in Descending order : ");
        printArray(arr);
    }

    public static void abubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;
        int totalswaps = 0;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            int swaps = 0;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Changed to arr[j] > arr[j + 1] for ascending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swaps++;
                    totalswaps++;
                }
            }

            if (!swapped) {
                break;
            }
            System.out.println("Swaps in turn " + (i + 1) + ": " + swaps);
        }

        System.out.println("Total Swaps : " + totalswaps);
        System.out.println("Final Array in Ascending order : ");
        printArray(arr);
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallest])
                    smallest = j;
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Final Array : ");
        printArray(arr);
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
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
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("0. GET ARRAY");
            System.out.println("1. Descending BUBBLE SORT");
            System.out.println("2. SELECTION SORT");
            System.out.println("3. INSERTION SORT");
            System.out.println("4. COUNTING SORT");
            System.out.println("5. Ascending Bubble Sort");
            System.out.println("Enter any number to Exit");
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            int arr[] = { 6, 2, 1, 8, 7, 4, 5, 3, 1, 3 };
            switch (choice) {
                case 0:
                    arr = getArray();
                    break;
                case 1:
                    dbubbleSort(arr);
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
                case 5:
                    abubbleSort(arr);
                    break;
                default:
                    exit = true;
                    break;
            }
        }
        sc.close();
    }
}