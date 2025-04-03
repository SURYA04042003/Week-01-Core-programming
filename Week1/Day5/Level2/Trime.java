package level2;

import java.util.Scanner;

public class Trime {
    public static int[] trimeSpacemanually(String text) {
        int textLength = text.length();
        int start = 0;
        int end = textLength - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String substringManually(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStringManually(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputString = scanner.nextLine();
        int[] trimIndices = trimeSpacemanually(inputString);
        String manuallyTrimmed = substringManually(inputString, trimIndices[0], trimIndices[1]);
        String builtInTrimmed = inputString.trim();
        boolean areEqual = compareStringManually(manuallyTrimmed, builtInTrimmed);
        System.out.println("Manually Trimmed String: \"" + manuallyTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Comparison Result: Manually trimmed string is " + (areEqual ? "equal" : "not equal") + " to the built-in trimmed string.");
    }
}
