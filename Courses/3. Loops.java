
//Prime Number
//Reverse a number - 2 methods
//Print name 5 times and include continue statement also
//Factorial
//Multiplication Table
import java.util.*;

public class Practice2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println(
                    "Enter the choice \n 1. Prime number \n 2. Reverse a number by method 1\n 3. Reverse a number by Method 2\n 4. REVERSE NUMBER VIA STRING BUILDER \n 5. Print your Name n times \n 6. Exit \n 7. FACTORIAL \n 8. Multiplication Table\n \1 \2 \3 \4 \5 \6 ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("PRIME NUMBER");
                    System.out.println("Enter the Nunmber.");
                    int p = (int) sc.nextFloat();
                    boolean isPrime = true;
                    if (p < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(p); i++) {
                            if (p % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println(p + " is a prime number.\n");
                    } else {
                        System.out.println(p + " is not a prime number.\n");
                    }
                    break;
                case 2:
                    System.out.println("REVERSE A NUMBER");
                    System.out.println("METHOD 1 \2");
                    System.out.println("Enter a number");
                    long n = sc.nextLong();
                    int rev = 0;
                    System.out.println("ORIGINAL NUMBER : " + n);
                    while (n > 0) {
                        int lastdigit = (int) n % 10;
                        rev = rev * 10 + lastdigit;
                        n = n / 10;
                    }

                    System.out.println("REVERSED NUMEBR : " + rev);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("REVERSE NUMBER");
                    System.out.println("METHOD 2");
                    System.out.println("Enter the number");
                    long num = sc.nextLong();
                    System.out.println("ORIGINAL NUMBER : " + num);

                    System.out.print("REVERSED NUMBER : ");
                    while (num > 0) {
                        int lastd = (int) num % 10;
                        System.out.print(lastd);
                        num /= 10;
                    }
                    System.out.println();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("REVERSE A NUMBER - STRING BUILDER");
                    System.out.println("Enter the Number:");
                    int nu = sc.nextInt();
                    StringBuilder sb = new StringBuilder(String.valueOf(nu));

                    // Reverse the StringBuilder
                    sb.reverse(); // Call reverse() on StringBuilder object
                    System.out.println("Reversed Number: " + sb.toString());
                    break;

                case 5:
                    System.out.println("PRINTING NAMES");
                    sc.nextLine(); // Consume the previous newline character
                    System.out.println("Enter your name");
                    String name = sc.nextLine();
                    System.out.println("How many times?");
                    int numb = sc.nextInt();
                    int c = 0;
                    while (c < numb) {
                        c++;
                        if (c == 4) {
                            continue;
                        }
                        System.out.println(c + " " + name);
                    }
                    System.out.println();
                    break;

                case 6:
                    exit = true;
                    break;
                case 7:
                    System.out.println("FACTORIAL");
                    System.out.println("Enter the number.");
                    int fn = sc.nextInt();
                    long fact = 1;
                    if (fn > 0) {
                        for (int i = 1; i <= fn; i++) {
                            fact = fact * i;
                        }
                        System.out.println("Factorial of " + fn + " = " + fact);
                        System.out.println();
                    } else {
                        System.out.println("Invalid Number ");
                    }
                    break;
                case 8:
                    System.out.println("MULTIPLICATION TABLE");
                    System.out.println("ENTER THE NUMBER.");
                    int mn = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(mn + " X " + i + " = " + mn * i);
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    System.out.println("Enter choice AGAIN");
                    break;
            }
        }
        sc.close();
    }
}