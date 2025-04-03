import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String text = scanner.nextLine();

        if (isPalindrome(text)) {
            System.out.println("The entered text is a palindrome.");
        } else {
            System.out.println("The entered text is not a palindrome.");
        }

        scanner.close();
    }
}
