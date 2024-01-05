import java.util.*;

public class Practice2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            System.out.println(
                    "Enter the choice number from the following :\n1. Square\n2. Rectangle \n3. Triangle\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("SQUARE");
                    System.out.println("Want to calculate\n1. Area\n2. Perimeter");
                    int pa = sc.nextInt();
                    switch (pa) {
                        case 1:
                            System.out.println("Enter the side of the square.");
                            float sqside = sc.nextFloat();
                            System.out.println("Area = " + (sqside * sqside) + " sq Units");
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Enter the side of the square.");
                            float sqs = sc.nextFloat();
                            System.out.println("Perimeter = " + (4 * sqs) + " Units");
                            System.out.println();
                            break;
                        default:
                            System.out.println("Entered Wrong Choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("RECTANGLE");
                    System.out.println("Want to calculate\n1.  Area\n2. Perimeter");
                    int ap = sc.nextInt();
                    switch (ap) {
                        case 1:
                            System.out.println("Enter the length and breadth of the rectangle.");
                            float rl = sc.nextFloat();
                            float rb = sc.nextFloat();
                            System.out.println("Area = " + (rb * rl) + " sq Units");
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Enter the length and breadth of the rectangle.");
                            float rl1 = sc.nextFloat();
                            float rb1 = sc.nextFloat();
                            System.out.println("Perimeter = " + (rl1 * rb1) + " Units");
                            System.out.println();
                            break;
                        default:
                            System.out.println("Entered Wrong Choice");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("TRIANGLE");
                    System.out.println("Which triangle is it? \n1. Equilateral\n2. Isosceles\n3. Scalene");
                    int t = sc.nextInt();
                    switch (t) {
                        case 1:
                            System.out.println("Want to calculate\n1.  Area\n2. Perimeter");
                            int pap = sc.nextInt();
                            switch (pap) {
                                case 1:
                                    System.out.println("Enter side of Equilateral Triangle.");
                                    float eqs = sc.nextFloat();
                                    System.out.println("Area = " + ((Math.sqrt(3) * eqs * eqs) / 4) + " sq Units");
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println("Enter side of Equilateral Triangle.");
                                    float eqss = sc.nextFloat();
                                    System.out.println("Perimeter = " + (3 * eqss) + " Units");
                                    System.out.println();
                                    break;
                                default:
                                    System.out.println("Entered Wrong Choice");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Want to calculate\n1.  Area\n2. Perimeter");
                            int papa = sc.nextInt();
                            switch (papa) {
                                case 1:
                                    System.out.println("Enter side of Isosceles Triangle.");
                                    float base = sc.nextFloat();
                                    float height = sc.nextFloat();
                                    System.out.println("Area = " + ((base * height) / 2) + " sq Units");
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println("Enter side of Isosceles Triangle.");
                                    float bases = sc.nextFloat();
                                    float heights = sc.nextFloat();
                                    System.out.println("Perimeter = "
                                            + ((2 * Math.sqrt(heights * heights + (bases / 2) * (bases / 2))) + bases)
                                            + " units");
                                    System.out.println();
                                    break;
                                default:
                                    System.out.println("Entered Wrong Choice");
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("Want to calculate\n1.  Area\n2. Perimeter");
                            int apa = sc.nextInt();
                            switch (apa) {
                                case 1:
                                    System.out.println("Enter side of Scalene Triangle.");
                                    float s1 = sc.nextFloat();
                                    float s2 = sc.nextFloat();
                                    float s3 = sc.nextFloat();
                                    double s = (s1 + s2 + s3) / 2;
                                    double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
                                    System.out.println("Area = " + area + " sq Units");
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println("Enter all the sides of Scalene Triangle.");
                                    float ss1 = sc.nextFloat();
                                    float ss2 = sc.nextFloat();
                                    float ss3 = sc.nextFloat();

                                    System.out.println("Perimeter = "
                                            + (ss1 + ss2 + ss3)
                                            + " units");
                                    System.out.println();
                                    break;
                                default:
                                    System.out.println("Entered Wrong Choice");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Entered Wrong Choice");
                            break;
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("You have entered a wrong choice.");
                    break;
            }
        }
        sc.close();
    }
}
