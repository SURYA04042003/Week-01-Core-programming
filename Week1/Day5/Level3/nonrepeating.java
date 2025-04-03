package level3;

import java.util.Scanner;

public class nonrepeating {
    public static int findLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] charCount = new int[256];
        int length = findLength(str);

        for (int i = 0; i < length; i++) {
            charCount[str.charAt(i)]++;
        }

        for (int i = 0; i < length; i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char firstNonRepeating = findFirstNonRepeatingChar(input);
        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

