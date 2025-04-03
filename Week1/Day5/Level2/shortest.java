package level2;

import java.util.Scanner;

public class shortest {
    public static String[] splitTexxtIntowords(String text) {
        String[] words = new String[100];
        int wordCount = 0;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                words[wordCount++] = word.toString();
                word.setLength(0);
            }
        }
        if (word.length() > 0) {
            words[wordCount++] = word.toString();
        }
        String[] results = new String[wordCount];
        System.arraycopy(words, 0, results, 0, wordCount);
        return results;
    }

    public static int findlength(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[][] createWordlengtharray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findlength(words[i]));
        }
        return wordLengthArray;
    }

    public static String[] findshortestandlargest(String[][] wordLengthArray) {
        String shortest = wordLengthArray[0][0];
        String longest = wordLengthArray[0][0];
        for (String[] row : wordLengthArray) {
            String word = row[0];
            int length = Integer.parseInt(row[1]);
            if (length < findlength(shortest)) {
                shortest = word;
            }
            if (length > findlength(longest)) {
                longest = word;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inputText = scanner.nextLine();
        scanner.close();

        String[] words = splitTexxtIntowords(inputText);
        String[][] wordLengthArray = createWordlengtharray(words);
        String[] result = findshortestandlargest(wordLengthArray);

        // Display result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t"+"\t"+"\t" + Integer.parseInt(row[1]));
        }

        System.out.println("\nShortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}