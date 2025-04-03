package level2;

import java.util.Random;
import java.util.Scanner;

public class grade {
    public static int[][] generateScores(int numStudents){
        Random random = new Random();
        int [][]scores = new int[numStudents][3];
        for(int i=0;i<numStudents;i++){
            scores[i][0]= random.nextInt(41)+60;
            scores[i][1]=random.nextInt(41)+60;
            scores[i][2]= random.nextInt(41)+60;
        }
        return scores;
    }
    public static double[][]calculatestatus(int [][]scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round(average * 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = percentage;
        }
        return stats;
    }
        public static String[] determineGrades(double[][] stats) {
            String[] grades = new String[stats.length];
            for (int i = 0; i < stats.length; i++) {
                double percentage = stats[i][2];
                if (percentage >= 80) grades[i] = "A";
                else if (percentage >= 70) grades[i] = "B";
                else if (percentage >= 60) grades[i] = "C";
                else if (percentage >= 50) grades[i] = "D";
                else if (percentage >= 40) grades[i] = "E";
                else grades[i] = "R";
            }
            return grades;
        }
        public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
            System.out.println("\nStudent Scorecard:");
            System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
            for (int i = 0; i < scores.length; i++) {
                System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                        (int) stats[i][0] + "\t" + String.format("%.2f", stats[i][1]) + "\t" + String.format("%.2f", stats[i][2]) + "\t" + grades[i]);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
            int numStudents = scanner.nextInt();
            scanner.close();

            int[][] scores = generateScores(numStudents);
            double[][] stats = calculatestatus(scores);
            String[] grades = determineGrades(stats);

            displayScorecard(scores, stats, grades);
        }
    }


