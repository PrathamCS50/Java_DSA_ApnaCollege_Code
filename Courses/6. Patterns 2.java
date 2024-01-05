import java.util.*;

public class Practice2 {

    public static void Hollow_Rectangular_Pattern(int row, int col) {
        for (int line = 1; line <= row; line++) {
            for (int j = 1; j <= col; j++) {
                if (line == 1 || j == 1 || line == row || j == col) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void Inverted_Rotated_Half_Pyramid(int n) {
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= n - line; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= line; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void Inverted_Half_pyramid_numbers(int n) {
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void Floyd_Triangle(int n) {
        int c = 1;
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(c + "\t");
                c++;
            }
            System.out.println();
        }
    }

    public static void Triangle_0_1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1\t");
                else
                    System.out.print("0\t");
            }
            System.out.println();
        }
    }

    public static void Stars_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void Upper_Butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void Lower_Butterfly(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n) {
        Upper_Butterfly(n);
        Lower_Butterfly(n);
    }

    public static void Solid_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("\t");
            for (int j = 1; j <= n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void Hollow_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        // UPPER
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // SPACES
            }
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        // LOWER
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choices.....");

        boolean exit = false;
        while (!exit) {
            System.out.println(
                    "1. Hollow Rectangular Pattern \n2. Inverted and Rotated Half Pyramid.\n3.Inverted Half Pyramid with Numbers\n4. Floyd's Triangle\n5. 0-1 Triangle\n6.Stars Pyramid\n7.Upper Butterfly\n8.Butterfly\n9. Solid Rhombus\n10. Hollow Rhombus \n11. Diamond \n12. Lower Butterfly\n13. EXIT");

            System.out.println();
            System.out.println("Hello , Enter choice number");
            int choice_no = sc.nextInt();
            switch (choice_no) {
                case 1:
                    System.out.println("Enter the number of rows and columns to print hollow rectangle.");
                    int tot_row = sc.nextInt();
                    int tot_col = sc.nextInt();
                    Hollow_Rectangular_Pattern(tot_row, tot_col);
                    break;

                case 2:
                    System.out.println("Enter number of levels for inverted and rotated half pyramid.");
                    int Inverted_Rotated_Half_Pyramid_level = sc.nextInt();
                    Inverted_Rotated_Half_Pyramid(Inverted_Rotated_Half_Pyramid_level);
                    break;

                case 3:
                    System.out.println("Enter the number of levels for Inverted half Pyramid with Numbers.");
                    int Inverted_Half_pyramid_numbers_level = sc.nextInt();
                    Inverted_Half_pyramid_numbers(Inverted_Half_pyramid_numbers_level);
                    break;

                case 4:
                    System.out.println("Enter the number of levels of Floyd's Triangle.");
                    int Floyd_Triangle_level = sc.nextInt();
                    Floyd_Triangle(Floyd_Triangle_level);
                    break;

                case 5:
                    System.out.println("Enter the levels for 0-1 Triangle.");
                    int Triangle_0_1_level = sc.nextInt();
                    Triangle_0_1(Triangle_0_1_level);
                    break;

                case 6:
                    System.out.println("Enter the number of levels.");
                    int Stars_Pyramid_level = sc.nextInt();
                    Stars_Pyramid(Stars_Pyramid_level);
                    break;

                case 7:
                    System.out.println("Enter the levels of butterfly");
                    int Upper_Butterfly_level = sc.nextInt();
                    Upper_Butterfly(Upper_Butterfly_level);
                    break;

                case 8:
                    System.out.println("Enter the levels of butterfly.");
                    int Butterfly_level = sc.nextInt();
                    Butterfly(Butterfly_level);
                    break;

                case 9:
                    System.out.println("Enter the number of levels of solid rhombus.");
                    int Solid_Rhombus_level = sc.nextInt();
                    Solid_Rhombus(Solid_Rhombus_level);
                    break;

                case 10:
                    System.out.println("Enter the number of levels of hollow Rhombus.");
                    int Hollow_Rhombus_level = sc.nextInt();
                    Hollow_Rhombus(Hollow_Rhombus_level);
                    break;

                case 11:
                    System.out.println("Enter the number of levels of diamond.");
                    int diamond_level = sc.nextInt();
                    diamond(diamond_level);
                    break;

                case 12:
                    System.out.println("Enter the levels of butterfly");
                    int Lower_Butterfly_level = sc.nextInt();
                    Lower_Butterfly(Lower_Butterfly_level);
                    break;

                case 13:
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