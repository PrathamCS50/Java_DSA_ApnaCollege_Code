// Search
//Largest
//Smallest
//DiagonalSum   O(n)
//Diagonal sum  O(n^2)
// staircaseSearch
// PrintSpiral

import java.util.Scanner;

public class Practice2 {

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

    public static void largestSmallestElement(int mat[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
                if (mat[i][j] < min) {
                    min = mat[i][j];
                }
            }
        }
        System.out.println("Largest Element is " + max);
        System.out.println("Smallest Element is " + min);
    }

    public static void diagonalSumApp1(int mat[][]) {
        int sum = 0;        //BRUTE FORCE APPROACH
        int row = mat.length;
        int col = mat[0].length;
        if (row == col) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (i == j) {
                        sum += mat[i][j];
                    } else if ((i + j) == (mat.length - 1) && i != j) {
                        sum += mat[i][j];
                    }
                }
            }
        }
        System.out.println("Sum by approach 1: " + sum);
    }

    public static void diagonalSumApp2(int mat[][]) {
        int sum = 0;    
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - i - 1];
            }
        }
        System.out.println("Sum By Approach 2 " + sum);
    }

    public static void stairCaseSearch(int mat[][], int key) {
        int startRow = 0;
        int endCol = mat[0].length - 1;

        while (startRow < mat.length && endCol >= 0) {
            if (key == mat[startRow][endCol]) {
                System.out.println("FOUND AT " + startRow + "," + endCol);
                return; // Optional: Terminate the method if the key is found
            } else if (key < mat[startRow][endCol]) {
                endCol--;
            } else {
                startRow++;
            }
        }
        System.out.println("NOT FOUND");
    }

    public static void PrintSpiral(int mat[][]) {
        int startrow = 0;
        int endrow = mat.length - 1;
        int startcol = 0;
        int endcol = mat[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(mat[startrow][j] + " , ");
            }
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(mat[i][endcol] + " , ");
            }
            for (int j = endcol - 1; j >= 0; j--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(mat[endrow][j] + " , ");
            }
            for (int i = endrow - 1; i > startrow; i--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(mat[i][startcol] + " , ");
            }
            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter the operation you want to perform:");
            System.out.println("1. Search an Element");
            System.out.println("2. Largest Element");
            System.out.println("3. Smallest Element\n4. Diagonal Sum : O(n^2)\n5. Diagonal Sum : O(n)");
            System.out.println("6. Stair Case Search\n7. Print Spiral\n8. EXIT");
            int choice = sc.nextInt();
            int mat[][] = { { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 } };

            switch (choice) {
                case 1:
                    System.out.println("Enter the key to be searcheed.");
                    int key = sc.nextInt();
                    for (int i = 0; i < mat.length; i++) {
                        for (int j = 0; j < mat[0].length; j++) {
                            if (key == mat[i][j]) {
                                System.out.println("FoUND at index : " + i + "," + j);
                            }
                        }
                    }
                    System.out.println("NOT FOUND");
                    break;
                case 2:
                    largestSmallestElement(mat);
                    break;
                case 3:
                    largestSmallestElement(mat);
                    break;
                case 4:
                    diagonalSumApp1(mat);
                    break;
                case 5:
                    diagonalSumApp2(mat);
                    break;
                case 6:
                    System.out.println("Enter the key to be searcheed.");
                    int key2 = sc.nextInt();
                    stairCaseSearch(mat, key2);
                    break;
                case 7:
                    PrintSpiral(mat);
                    break;
                case 8:
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
