package level1;

import java.util.Random;
import java.util.Scanner;

public class numberguess {
        public static int generateGuess(int low, int high) {
            Random random = new Random();
            return low + random.nextInt(high - low + 1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int low = 1, high = 100;
            boolean guessedCorrectly = false;

            System.out.println("Think of a number between 1 and 100.");
            System.out.println("I will try to guess it. Respond with:");
            System.out.println("'H' if my guess is too high, 'L' if it's too low, 'C' if it's correct.");

            while (!guessedCorrectly) {
                int guess = generateGuess(low, high);
                System.out.println("Is your number " + guess + "? (H/L/C): ");
                char feedback = scanner.next().charAt(0);

                if (feedback == 'C' || feedback == 'c') {
                    guessedCorrectly = true;
                    System.out.println("Great! I guessed your number.");
                } else if (feedback == 'H' || feedback == 'h') {
                    high = guess - 1;
                } else if (feedback == 'L' || feedback == 'l') {
                    low = guess + 1;
                } else {
                    System.out.println("Invalid input. Please enter 'H', 'L', or 'C'.");
                }
            }

            scanner.close();
        }
    }


