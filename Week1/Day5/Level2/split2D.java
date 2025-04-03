package level2;

import java.util.Scanner;

public class split2D {
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
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    public static int findlength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String Text = scan.nextLine();
        scan.close();

        String[] words = splitTexxtIntowords(Text);
        String[][] wordLengthArray = createWordlengtharray(words);
        System.out.println("\nWord\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t"+"\t"+"\t" + Integer.parseInt(row[1]));
        }
    }
}
