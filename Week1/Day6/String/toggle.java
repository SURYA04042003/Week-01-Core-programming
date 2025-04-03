package extraday5;
import java.util.Scanner;
public class toggle {
        public static String toggleCase(String text) {
            StringBuilder result = new StringBuilder();
            for (char ch : text.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                } else if (Character.isLowerCase(ch)) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(ch);
                }
            }
            return result.toString();
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String text = scanner.nextLine();
            String toggledText = toggleCase(text);
            System.out.println("Toggled case string: " + toggledText);
            scanner.close();
        }
    }

