import java.util.*;

public class Practice2Assignment {

    public static void getmatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the 2D Matrix.");
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[rows][col];
        System.out.println("ROW WISE FILLING");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void printMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void countElementNumber(int mat[][], int key) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (key == mat[i][j]) {
                    count++;
                }
            }
        }
        System.out.println("Coutn of " + key + " is " + count);
    }

    public static void sumOfSecondRowElements(int mat[][]) {
        int total = 0;
        for (int j = 0; j < mat[0].length; j++) {
            total += mat[1][j];
        }
        System.out.println("Sum of elements in 2nd row is " + total);
    }

    public static void transpose(int mat[][]) {
        System.out.println("ORIGINAL MATRIX");
        printMatrix(mat);
        System.out.println("TRANSPOSE MATRIX\n");
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Q1. Print the number of 7’s that are in the 2d array.");
            System.out.println("Q2. Print out the sum of the numbers in the second row of the nums array.");
            System.out.println("Q3. Write a program to Find Transpose of a Matrix.");
            System.out.println("4. EXIT");
            System.out.println("Enter Choice.");
            int choice = sc.nextInt();

            int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
            int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
            switch (choice) {
                case 1:
                    printMatrix(array);
                    System.out.println("Enter Key");
                    int key = sc.nextInt();
                    countElementNumber(array, key);
                    break;
                case 2:
                    printMatrix(nums);
                    sumOfSecondRowElements(nums);
                    break;
                case 3:
                    System.out.println("Transpose");
                    transpose(nums);
                    break;
                case 4:
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
