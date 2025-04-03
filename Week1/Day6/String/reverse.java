import java.util.Scanner;

public class reverse {

    // Method to reverse a string
    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String text = scanner.nextLine();

        String reversedText = reverseString(text);
        System.out.println("Reversed String: " + reversedText);

        scanner.close();
    }
}
