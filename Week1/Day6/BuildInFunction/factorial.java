package level1;

import java.util.Scanner;

public class factorial {
        public static long factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }
        public static int getUserInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to calculate factorial: ");
            int number = scanner.nextInt();
            scanner.close();
            return number;
        }

        public static void main(String[] args) {
            int number = getUserInput();

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long result = factorial(number);
                System.out.println("Factorial of " + number + " is: " + result);
            }
        }
    }
