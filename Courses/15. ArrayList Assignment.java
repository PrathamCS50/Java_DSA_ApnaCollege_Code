/*
 * Q1
 * Q2
 * Q3       ---------------------------------------  REDO
 * Q4       ---------------------------------------  REDO
 */

import java.util.*;

public class Practice2Assignment {

    public static void monotone(ArrayList<Integer> arr) {
        boolean ismonotoneinc = true;
        boolean ismonotonedec = true;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                ismonotoneinc = false;
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < arr.get(i + 1)) {
                ismonotonedec = false;
            }
        }
        System.out.println("Monotone Property : ");
        System.out.print(ismonotonedec || ismonotoneinc);
    }

    public static void lonelyNumbers(ArrayList<Integer> arr) {
        ArrayList<Integer> numbers = new ArrayList<>();

        if (arr.isEmpty()) {
            System.out.println("Lonely numbers: " + numbers);
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            boolean lonely = true;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i).equals(arr.get(j))) {
                    lonely = false;
                    break;
                }
            }
            if (lonely) {
                if (i == 0 || i == arr.size() - 1 || (!arr.contains(arr.get(i) - 1) && !arr.contains(arr.get(i) + 1))) {
                    numbers.add(arr.get(i));
                }
            }
        }

        System.out.println("Lonely numbers: " + numbers);
    }

    public static int findMostFrequentNumberFollowingKey(ArrayList<Integer> nums, int key) {
        Map<Integer, Integer> targetCounts = new HashMap<>();

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int target = nums.get(i + 1);
                targetCounts.put(target, targetCounts.getOrDefault(target, 0) + 1);
            }
        }

        int maxCount = 0;
        int resultTarget = -1;

        for (Map.Entry<Integer, Integer> entry : targetCounts.entrySet()) {
            int target = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                resultTarget = target;
            }
        }
        return resultTarget;
    }

    public static ArrayList<Integer> beautifulArray(int n) {
        if (n == 1) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(1);
            return result;
        }

        ArrayList<Integer> oddNums = beautifulArray((n + 1) / 2);
        ArrayList<Integer> evenNums = beautifulArray(n / 2);

        ArrayList<Integer> beautifulNums = new ArrayList<>();

        // Merge odd numbers first
        for (int num : oddNums) {
            beautifulNums.add(2 * num - 1);
        }

        // Merge even numbers
        for (int num : evenNums) {
            beautifulNums.add(2 * num);
        }

        return beautifulNums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        boolean userArrayListProvided = false;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!exit) {
            if (!userArrayListProvided && arrayList == null) {
                System.out.println("User-defined ArrayList not provided. Using default height ArrayList.");
                arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 7, 9, 11, 15, 17, 20));
            }
            System.out.println();
            System.out.println("0. Get Array.");
            System.out.println(
                    "1.Monotonic ArrayList\n An Arraylist is monotonic if it is either monotone increasing or monotone decreasing  ");
            System.out.println(
                    "2. Lonely Numbers in ArrayList\n You are given an integer arraylist nums. A number x is lonely when it appears only once, and "
                            +
                            "no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.");
            System.out.println("3. Most Frequent Number following Key : ");
            System.out.println(
                    "4. Beautiful ArrayList (MEDIUM) : nums is a permutation of the integers in the range [1, n]." +
                            "For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums.get(k) == nums.get(i) +"
                            + //
                            "nums.get(j)." +
                            "Given the integer n, return any beautiful arraylist nums of size n. There will be at least one valid"
                            + //
                            "answer for the given n.");
            System.out.println("Enter choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    ArrayList<Integer> urlist = new ArrayList<>();
                    System.out.println("How many elements do you want to add?");
                    int nofel = sc.nextInt();
                    System.out.println("Enter Elements");
                    for (int i = 0; i < nofel; i++) {
                        urlist.add(sc.nextInt());
                    }
                    arrayList = urlist;
                    userArrayListProvided = true;
                    break;
                case 1:
                    monotone(arrayList);
                    break;
                case 2:
                    lonelyNumbers(arrayList);
                    break;
                case 3:
                    System.out.println("Enter Key");
                    int key = sc.nextInt();
                    int result = findMostFrequentNumberFollowingKey(arrayList, key);
                    System.out.println("Target with the maximum count: " + result);
                    break;
                case 4:
                    System.out.println("Enter the number");
                    int n = sc.nextInt();
                    ArrayList<Integer> beautifulNums = beautifulArray(n);
                    System.out.println("Beautiful ArrayList of size " + n + ":");
                    System.out.println(beautifulNums);
                    break;
                default:
                    System.exit(-1);
            }
        }
        sc.close();
    }
}
