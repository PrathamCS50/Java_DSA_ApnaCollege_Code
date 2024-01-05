
/*
 * Addd, Print, Remove. Get , Set, contains, sorting in both orders
 * Maximum/Minimum in an array list
 * Swap function
 * Maximum Rainwater    ArrayList<Integer> heigth = [1, 8, 6, 2, 5, 4, 8, 3, 7] -- Brute Force(Nested Loops)
 * optimised version of maximum rainwater (2 Pointer Approach)
 * MultiDimensional Array Concept - Print, all and individual
 * Pair Sum = Target ;; Print the pair, 2 Optimised ways
 * 
 * PAIR SUM OPTIMISED WAY 2 ----------------   REDO--------- VIDEO
 */
import java.util.*;

public class Practice2 {
    public static void maximumInteger(ArrayList<Integer> arrlist) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrlist.size(); i++) {
            max = Math.max(max, arrlist.get(i));
        }
        System.out.println("Maximum is " + max);
    }

    public static void minimumInteger(ArrayList<Integer> arrlist) {
        int min = Integer.MAX_VALUE;
        for (int i = arrlist.size() - 1; i >= 0; i--) {
            min = Math.min(min, arrlist.get(i));
        }
        System.out.println("Minimum is " + min);
    }

    public static void swapIntegers(ArrayList<Integer> arrlist, int a, int b) {
        if (arrlist == null || arrlist.isEmpty()) {
            System.out.println("INVALID INDEX");
            return;
        }
        if (a < 0 || a >= arrlist.size() || b < 0 || b >= arrlist.size()) {
            System.out.println("INVALID INDEX");
            return;
        }
        Collections.swap(arrlist, a, b);
        System.out.println("Swapped ArrayList: " + arrlist);
    }

    public static void maxrainwater1(ArrayList<Integer> height) {
        // BRUTE FORCE
        int maxwater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int currwater = (j - i) * Math.min(height.get(i), height.get(j));
                maxwater = Math.max(maxwater, currwater);
            }
        }
        System.out.println("Maximum Rainwater is " + maxwater + " volumes.");
    }

    public static void maxrainwater2(ArrayList<Integer> height) {
        int maxwaterr = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int pani = (rp - lp) * Math.min(height.get(lp), height.get(rp));
            maxwaterr = Math.max(pani, maxwaterr);
            if (height.get(lp) < height.get(rp))
                lp++;
            else
                rp--;
        }
        System.out.println("Maximum Rainwater is " + maxwaterr + " volumes.");
    }

    public static void multiDimensionalArrayList() {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            list1.add(i * 2);
        }
        for (int i = 1; i <= 4; i++) {
            list2.add(i * 3);
        }
        for (int i = 1; i <= 4; i++) {
            list3.add(i * 4);
        }
        for (int i = 1; i <= 4; i++) {
            list4.add(i * 5);
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        mainlist.add(list4);

        System.out.println("Multi-Dimensional ArrayList:");
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> sublist = mainlist.get(i);
            for (int j = 0; j < sublist.size(); j++) {
                System.out.print(sublist.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void pairsum1(ArrayList<Integer> arrl, int target) {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < arrl.size(); i++) {
            for (int j = i + 1; j < arrl.size(); j++) {
                if (arrl.get(i) + arrl.get(j) == target) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(arrl.get(i));
                    pair.add(arrl.get(j));
                    pairs.add(pair);
                }
            }
        }

        if (!pairs.isEmpty()) {
            System.out.println("Pairs found that sum to " + target + ":");
            for (ArrayList<Integer> pair : pairs) {
                System.out.println(pair.get(0) + " and " + pair.get(1));
            }
        } else {
            System.out.println("No pairs found that sum to " + target);
        }
    }

    public static void pairsum2(ArrayList<Integer> arrl, int target) {
        Collections.sort(arrl);
        int lp = 0;
        int rp = arrl.size() - 1;
        boolean foundPair2 = false;

        while (lp < rp) {
            int sum = arrl.get(lp) + arrl.get(rp);
            if (target == sum) {
                System.out.println("Pair found:");
                System.out.println("At index : " + lp + " Element is : " + arrl.get(lp));
                System.out.println("At index : " + rp + " Element is : " + arrl.get(rp));
                System.out.println("Sum is " + target);
                foundPair2 = true;
                break;
            } else if (sum > target) {
                rp--;
            } else {
                lp++;
            }
        }

        if (!foundPair2) {
            System.out.println("No such pair found for sum " + target);
        }
    }

    public static void pairsum3(ArrayList<Integer> arrl, int target) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        boolean userArrayListProvided = false;
        ArrayList<Integer> height = null;
        while (!exit) {
            if (!userArrayListProvided && height == null) {
                System.out.println("User-defined ArrayList not provided. Using default height ArrayList.");
                height = new ArrayList<>(List.of(1, 8, 6, 2, 5, 4, 8, 3, 7));
            }
            System.out.println();
            System.out.println("0. Get Your ArrayList");
            System.out.println("1. Basic Functions");
            System.out.println("2. Maximum And Minimum From an ArrayList Integer");
            System.out.println("3. SWAPPING 2 Elements");
            System.out.println("4. Maximum Rainwater Approach 1");
            System.out.println("5. Maximum Rainwater Approach 2");
            System.out.println("6. Multi-Dimensional ArrayList");
            System.out.println("7. PAIR SUM app 1");
            System.out.println("8. PAIR SUM APp 2");
            System.out.println("9. Pair SUm APP 3");
            System.out.println("Enter your choice:");

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
                    height = urlist;
                    userArrayListProvided = true; // Set the flag to true since the user provided the ArrayList
                    break;
                case 1:
                    ArrayList<Integer> list1 = new ArrayList<>();
                    ArrayList<String> list2 = new ArrayList<>();
                    list1.add(1);
                    list1.add(2);
                    list1.add(3);

                    list2.add("Pratham");
                    list2.add("Goel");
                    System.out.println("List 1 : " + list1);
                    for (int i = 4; i < 8; i++) {
                        list1.add(i);
                    }
                    if (list1.contains(5))
                        System.out.println("5 is in the List 1.");
                    System.out.println("How many elemnts u want to add.");
                    int nofele = sc.nextInt();
                    System.out.println("Enter Elements");
                    for (int i = 0; i < nofele; i++) {
                        list1.add(sc.nextInt());
                    }
                    System.out.println("3rd Element in list 1 is : " + list1.get(2));
                    System.out.println("Which element index U wanna to remove?");
                    int indexremove = sc.nextInt();
                    list1.remove(indexremove);
                    System.out.println("List after removing : " + list1);
                    if (list1.contains(42)) {
                        System.out.println("42 is in the list");
                    } else {
                        System.out.println("42 in not PRESENT");
                    }
                    System.out.println("The present size of array is " + list1.size());
                    System.out.println("The present size of array is " + list2.size());
                    System.out.println(list2);
                    System.out.println("Elements of LIST 2");
                    for (int i = 0; i < list2.size(); i++) {
                        System.out.println(list2.get(i));
                    }
                    System.out.println("1. Ascending\n2. Descending");
                    int ad = sc.nextInt();
                    switch (ad) {
                        case 1:
                            for (int i = 0; i < list1.size(); i++) {
                                System.out.print(list1.get(i) + " ");
                            }
                            break;
                        case 2:
                            Collections.sort(list1, Collections.reverseOrder());
                            break;
                    }
                    break;
                case 2:
                    System.out.println(height);
                    System.out.println("1. Maximum\n2. Minimum");
                    int mm = sc.nextInt();
                    switch (mm) {
                        case 1:
                            maximumInteger(height);
                            break;
                        case 2:
                            minimumInteger(height);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter the indices to swap (space-separated):");
                    int index1 = sc.nextInt();
                    int index2 = sc.nextInt();
                    System.out.println("Original ArrayList: " + height);
                    swapIntegers(height, index1, index2);
                    break;
                case 4:
                    maxrainwater1(height);
                    break;
                case 5:
                    maxrainwater2(height);
                    break;
                case 6:
                    multiDimensionalArrayList();
                    break;
                case 7:
                    System.out.println("Enter the target sum:");
                    int targetSum1 = sc.nextInt();
                    pairsum1(height, targetSum1);
                    break;
                case 8:
                    System.out.println("Enter the target sum:");
                    int targetSum2 = sc.nextInt();
                    pairsum2(height, targetSum2);
                    break;
                case 9:
                    pairsum3(height, 12);
                    break;
                case 10:
                    exit = true;
                    break;
                default:
                    System.exit(-1);

            }
        }
        sc.close();
    }
}
