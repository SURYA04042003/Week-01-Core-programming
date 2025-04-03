package level1;

import java.util.Scanner;

public class primechecker {
        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) { // Loop up to √num for efficiency
                if (num % i == 0) {
                    return false; // If divisible, it's not prime
                }
            }
            return true; // If no factors found, it's prime
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking user input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Checking if the number is prime
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

            scanner.close();
        }
    }


