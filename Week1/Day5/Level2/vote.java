package level2;

import java.util.Random;
import java.util.Scanner;

public class vote {
        public static int[] generateAges(int n) {
            Random random = new Random();
            int[] ages = new int[n];
            for (int i = 0; i < n; i++) {
                ages[i] = random.nextInt(90) + 10;
            }
            return ages;
        }
        public static String[][] checkVoting(int[] ages) {
            String[][] eligibilityArray = new String[ages.length][2];
            for (int i = 0; i < ages.length; i++) {
                eligibilityArray[i][0] = String.valueOf(ages[i]);
                if (ages[i] < 0) {
                    eligibilityArray[i][1] = "Cannot Vote";
                } else if (ages[i] >= 18) {
                    eligibilityArray[i][1] = "Can Vote";
                } else {
                    eligibilityArray[i][1] = "Cannot Vote";
                }
            }
            return eligibilityArray;
        }
        public static void displayEligibility(String[][] eligibilityArray) {
            System.out.println("\nAge\tVoting Eligibility");
            for (String[] row : eligibilityArray) {
                System.out.println(row[0] + "\t" + row[1]);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
            int numStudents = scanner.nextInt();
            scanner.close();

            int[] ages = generateAges(numStudents);
            String[][] eligibilityArray = checkVoting(ages);
            displayEligibility(eligibilityArray);
        }
    }


