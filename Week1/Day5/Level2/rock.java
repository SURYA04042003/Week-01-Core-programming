package level2;

import java.util.Random;
import java.util.Scanner;

public class rock {
        public static String getComputerChoice() {
            String[] choices = {"Rock", "Paper", "Scissors"};
            return choices[new Random().nextInt(3)];
        }
        public static String determineWinner(String userChoice, String computerChoice) {
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                return "Draw";
            }
            if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                    (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                    (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                return "User";
            }
            return "Computer";
        }
        public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
            String[][] stats = new String[2][2];
            stats[0][0] = "User Wins";
            stats[0][1] = String.format("%.2f%%", (userWins * 100.0 / totalGames));
            stats[1][0] = "Computer Wins";
            stats[1][1] = String.format("%.2f%%", (computerWins * 100.0 / totalGames));
            return stats;
        }
        public static void displayResults(String[][] gameResults, String[][] stats) {
            System.out.println("\nGame Results:");
            System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
            System.out.println("-------------------------------------------------");
            for (int i = 0; i < gameResults.length; i++) {
                System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t" + gameResults[i][2]);
            }
            System.out.println("\nWin Percentage:");
            System.out.println("Category\tPercentage");
            for (String[] row : stats) {
                System.out.println(row[0] + "\t" + row[1]);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of games: ");
            int numGames = scanner.nextInt();
            scanner.nextLine();

            String[][] gameResults = new String[numGames][3];
            int userWins = 0, computerWins = 0;

            for (int i = 0; i < numGames; i++) {
                System.out.println("Enter Rock, Paper, or Scissors: ");
                String userChoice = scanner.nextLine();
                String computerChoice = getComputerChoice();
                String winner = determineWinner(userChoice, computerChoice);

                gameResults[i][0] = userChoice;
                gameResults[i][1] = computerChoice;
                gameResults[i][2] = winner;

                if (winner.equals("User")) userWins++;
                else if (winner.equals("Computer")) computerWins++;
            }
            scanner.close();

            String[][] stats = calculateStats(userWins, computerWins, numGames);
            displayResults(gameResults, stats);
        }
    }


