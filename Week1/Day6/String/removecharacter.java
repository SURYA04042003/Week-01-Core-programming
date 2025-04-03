package extraday5;

import java.util.Scanner;

public class removecharacter {
        public static String removeCharacter(String text, char toRemove) {
            StringBuilder result = new StringBuilder();

            for (char ch : text.toCharArray()) {
                if (ch != toRemove) {
                    result.append(ch);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = scanner.nextLine();

            System.out.print("Enter the character to remove: ");
            char toRemove = scanner.next().charAt(0);

            String modifiedString = removeCharacter(text, toRemove);

            System.out.println("Modified String: " + modifiedString);

            scanner.close();
        }
    }

