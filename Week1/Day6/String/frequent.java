package extraday5;

import java.util.Scanner;

public class frequent {
        public static char findMostFrequentChar(String text) {
            int[] frequency = new int[256];
            int maxFreq = 0;
            char mostFrequentChar = '\0';

            for (char ch : text.toCharArray()) {
                frequency[ch]++;
                if (frequency[ch] > maxFreq) {
                    maxFreq = frequency[ch];
                    mostFrequentChar = ch;
                }
            }

            return mostFrequentChar;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = scanner.nextLine();

            char mostFrequentChar = findMostFrequentChar(text);

            System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

            scanner.close();
        }
    }
