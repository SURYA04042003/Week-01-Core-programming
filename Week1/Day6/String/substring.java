package extraday5;

import java.util.Scanner;

public class substring {
        public static int countSubstringOccurrences(String text, String substring) {
            int count = 0;
            int index = 0;

            while ((index = text.indexOf(substring, index)) != -1) {
                count++;
                index += substring.length(); // Move index forward to avoid counting overlapping substrings
            }

            return count;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the main text: ");
            String text = scanner.nextLine();

            System.out.print("Enter the substring to count: ");
            String substring = scanner.nextLine();

            int occurrences = countSubstringOccurrences(text, substring);
            System.out.println("The substring \"" + substring + "\" occurs " + occurrences + " times in the given text.");

            scanner.close();
        }
    }
