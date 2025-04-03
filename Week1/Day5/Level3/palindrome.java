import java.util.Scanner;

public class palindrome {

    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reversed));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.println("Iterative Check: " + (isPalindromeIterative(text) ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Recursive Check: " + (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Character Array Check: " + (isPalindromeCharArray(text) ? "Palindrome" : "Not a Palindrome"));
        scanner.close();
    }
}
