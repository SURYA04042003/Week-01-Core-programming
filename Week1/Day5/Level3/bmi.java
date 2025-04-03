package level3;

import java.util.Scanner;

public class bmi {
        public static String[][] calculateBMI(double[][] persons) {
            String[][] bmiResults = new String[persons.length][4];

            for (int i = 0; i < persons.length; i++) {
                double weight = persons[i][0];
                double heightInMeters = persons[i][1] / 100;
                double bmi = weight / (heightInMeters * heightInMeters);

                String status;
                if (bmi <= 18.4) status = "Underweight";
                else if (bmi <=24.9 ) status = "Normal weight";
                else if (bmi <= 39.9) status = "Overweight";
                else status = "Obese";

                bmiResults[i][0] = String.valueOf(weight);
                bmiResults[i][1] = String.valueOf(persons[i][1]);
                bmiResults[i][2] = String.format("%.2f", bmi);
                bmiResults[i][3] = status;
            }
            return bmiResults;
        }
        public static void displayBMIResults(String[][] results) {
            System.out.println("\nBMI Report:");
            System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\tStatus");

            for (int i = 0; i < results.length; i++) {
                System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + results[i][3]);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[][] persons = new double[10][2];

            System.out.println("Enter the weight (kg) and height (cm) for 10 persons:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Person " + (i + 1) + " Weight (kg): ");
                persons[i][0] = scanner.nextDouble();
                System.out.print("Person " + (i + 1) + " Height (cm): ");
                persons[i][1] = scanner.nextDouble();
            }
            scanner.close();

            String[][] results = calculateBMI(persons);
            displayBMIResults(results);
        }
    }

