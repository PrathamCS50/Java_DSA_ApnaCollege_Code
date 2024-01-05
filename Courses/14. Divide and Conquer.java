/*
 * Merge Sort
 * Quick Sort
 * Search Sorted Array
 * DDOO AASSSIIGGNNMMEENNTTTT
 * Merge Sort an array of Strings
 */

import java.util.*;

public class Practice2 {

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int search(int arr[], int tar, int si, int ei) {

        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void Quick_Sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = Partition(arr, 0, ei);
        Quick_Sort(arr, si, pidx - 1);
        Quick_Sort(arr, pidx + 1, ei);
    }

    public static int Partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // TO MAKE PLACE FOR ELEMTNTS SMALLER THAN PIVOT

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void Merge_Sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        Merge_Sort(arr, si, mid);
        Merge_Sort(arr, mid + 1, ei);
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[ei - si + 1];
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) { // LEFT PART REMAINING ELEMENTS
            temp[k++] = arr[i++];
        }
        while (j <= ei) { // RIGHT PART REMAINING ELEMENTS
            temp[k++] = arr[j++];
        }
        // COPY TEMPERORARY ARRAY TO ORIGINAL ARRAY
        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static String[] MergeSort_String(String[] arr, int lo, int hi) {
        if (lo == hi) {
            String[] A = { arr[lo] };
            return A;
        }
        int mid = lo + (hi - lo) / 2;
        String[] arr1 = MergeSort_String(arr, lo, mid);
        String arr2[] = MergeSort_String(arr, mid + 1, hi);
        String arr3[] = MergeString(arr1, arr2);
        return arr3;
    }

    public static String[] MergeString(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int idx = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            } else {
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }

    static boolean isAlphabeticallySmaller(String str1, String str2) {
        // Return true if str1 appears before str2 in alphabetical order
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static int MajorityElement1(int arr[]) {
        int majorCount = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
            if (count > majorCount) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int MajorElement2(int arr[]) {
        return MajorElement2Rec(arr, 0, arr.length - 1);
    }

    public static int MajorElement2Rec(int arr[], int lo, int hi) {

        // base case; the only element in an array of size 1 is the majority element.
        if (lo == hi) {
            return arr[lo];
        }

        // recurse on left and right halves of this slice
        int mid = lo + (hi - lo) / 2;
        int left = MajorElement2Rec(arr, lo, mid);
        int right = MajorElement2Rec(arr, mid + 1, hi);

        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftcount = countInRange(arr, left, lo, hi);
        int rightcount = countInRange(arr, right, lo, hi);

        return leftcount > rightcount ? left : right;
    }

    public static int countInRange(int arr[], int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (arr[i] == num)
                count++;
        }
        return count;
    }

    public static int geInvCount(int arr[]) {
        int n = arr.length;
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        // int arr[] = null;
        // boolean userprovidedarray = false;
        while (!exit) {
            System.out.println("\nEnter the choice");
            System.out.println("0. GIVE UR ARRAY");
            System.out.println("1. Search the sorted array");
            System.out.println("2. Quick Sort");
            System.out.println("3. Merge Sort");
            System.out.println("4. Merge Sort an Array of Strings.");
            System.out.println("5. Returning Majority Element APPROACH 1");
            System.out.println("6. Returning Majority Element APPROACH 2");
            System.out.println("7. Inversion Approach 1.");
            System.out.println("8. inversion Approach 2");

            int choice = sc.nextInt();
            int arr2[] = { 4, 5, 6, 7, 0, 1, 2 };
            String arrstr[] = { "earth", "sun", "mars", "mercury" };
            switch (choice) {
                // case 0:
                // System.out.println("Enter the length of array");
                // int al0 = sc.nextInt();
                // arr = new int[al0];
                // System.out.println("Enter teh elements");
                // for (int i = 0; i < al0 - 1; i++) {
                // arr[i] = sc.nextInt();
                // }
                // printArray(arr);
                // userprovidedarray = true;
                // break;
                case 1:
                    // if (userprovidedarray || arr != null) {
                    System.out.println("\nEnter the target value");
                    int target1 = sc.nextInt();
                    int taridx = search(arr2, target1, 0, arr2.length - 1);
                    System.out.println(taridx);
                    // searchSortedArray(userprovidedarray ? arr : new int[] { 4, 5, 6, 7, 0, 1, 2
                    // }, target1,
                    // 0, (userprovidedarray ? arr : new int[] { 4, 5, 6, 7, 0, 1, 2 }).length -
                    // 1));
                    // } else {
                    // System.out.println("Please provide an array first.");
                    // }
                    break;
                case 2:
                    // if (userprovidedarray || arr != null) {
                    System.out.println("Quick Sort");
                    Quick_Sort(arr2, 0, arr2.length - 1);
                    printArray(arr2);
                    // Quick_Sort(userprovidedarray ? arr : new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0,
                    // (userprovidedarray ? arr : new int[] { 4, 5, 6, 7, 0, 1, 2 }).length - 1);
                    // } else {
                    // System.out.println("Please provide an array first.");
                    // }
                    break;
                case 3:
                    // if (userprovidedarray || arr != null) {
                    System.out.println("Merge Sort");
                    Merge_Sort(arr2, 0, arr2.length - 1);
                    printArray(arr2);
                    // Merge_Sort(userprovidedarray ? arr : new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0,
                    // (userprovidedarray ? arr : new int[] { 4, 5, 6, 7, 0, 1, 2 }).length - 1);
                    // } else {
                    // System.out.println("Please provide an array first.");
                    // }
                    break;
                case 4:
                    System.out.println("MergeSort Strings.");
                    String arrString[] = MergeSort_String(arrstr, 0, arrstr.length - 1);
                    for (int i = 0; i < arrString.length; i++) {
                        System.out.print(arrString[i] + " ");
                    }
                    break;
                case 5:
                    System.out.println("5. Returning Majority Element Approach 1");

                    int arr5[] = { 2, 2, 2, 1, 1, 1, 2, 2 };
                    System.out.println("\nMajority Element by Approach 1 is " + MajorityElement1(arr5));
                    break;
                case 6:

                    int arr6[] = { 2, 2, 2, 1, 1, 1, 2, 2 };
                    System.out.println("\nMajority Element by APPROACH 2 is " + MajorityElement1(arr6));
                    break;
                case 7:
                    System.out.println("Inversion Count : " + geInvCount(arr2));
                    break;
                case 8:
                    // CHECK THE SOLUTIONS AND UNDERSTAND IT
                    System.out.println("CHECK THE SOLUTIONS AND UNDERSTAND IT");
                    break;

                default:
                    exit = true;
            }
        }
        sc.close();
    }
}
