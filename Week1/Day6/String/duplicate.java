package extraday5;

import java.util.Scanner;

public class duplicate {
        public static String removeDuplicates(String text) {
            StringBuilder result = new StringBuilder();
            boolean[] seen = new boolean[256];

            for (char ch : text.toCharArray()) {
                if (!seen[ch]) {
                    result.append(ch);
                    seen[ch] = true;
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String text = scanner.nextLine();

            System.out.println("String after removing duplicates: " + removeDuplicates(text));

            scanner.close();
        }
    }
