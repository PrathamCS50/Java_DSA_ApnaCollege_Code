// Character Pattern
// Half Pyramid Pattern of numbers
// Inverted Star Pattern
// Pattern Star

import java.util.*;

public class Practice2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter the number pattern you want to print");
            System.out.println(
                    "\1 1. Character Pattern \n\2 2. Half Pyramid Pattern of Numbers\n\3 3. Inverted Star Pattern \n\4 4. Pattern Star \n\5 5. EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("CHARACTER PATTERN");
                    System.out.println("Enter the number of lines");
                    int n1 = (int) sc.nextFloat();
                    char c = 'A';
                    for (int line = 1; line <= n1; line++) {
                        for (int ch = 1; ch <= line; ch++) {
                            System.out.print(c + "\t");
                            c++;
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("HALF PYRAMID PATTERN OF NUMEBRS");
                    System.out.println("Enter the number of lines");
                    int n2 = (int) sc.nextFloat();
                    for (int line = 1; line <= n2; line++) {
                        for (int no = 1; no <= line; no++) {
                            System.out.print(no + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("INVERTED STAR PATTERN");
                    System.out.println("Enter the number of lines");
                    int n3 = (int) sc.nextFloat();
                    for (int line = 1; line <= n3; line++) {
                        for (int star = n3; star >= line; star--) {
                            System.out.print("*\t");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("PATTERN STAR");
                    System.out.println("Enter the number of lines");
                    int n4 = (int) sc.nextFloat();
                    for (int line = 1; line <= n4; line++) {
                        for (int ch = 1; ch <= line; ch++) {
                            System.out.print("#\t");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}