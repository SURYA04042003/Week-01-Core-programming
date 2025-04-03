package level1;

import java.util.Scanner;

public class gcd{
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }
        public static int[] getUserInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            scanner.close();
            return new int[]{num1, num2};
        }
        public static void main(String[] args) {
            int[] numbers = getUserInput();
            int num1 = numbers[0], num2 = numbers[1];

            int gcdResult = gcd(num1, num2);
            int lcmResult = lcm(num1, num2);

            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);
        }
    }

