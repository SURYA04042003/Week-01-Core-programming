package level3;

import java.util.Scanner;

public class frequency {
    public static int findLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
    public static int[][] findCharacterFrequency(String str) {
        int[] charCount = new int[256];
        int length = findLength(str);
        for (int i = 0; i < length; i++) {
            charCount[str.charAt(i)]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 0) {
                uniqueCount++;
            }
        }

        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 0) {
                result[index][0] = i;
                result[index][1] = charCount[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[][] frequency = findCharacterFrequency(input);
        System.out.println("Character Frequency:");
        for (int[] entry : frequency) {
            System.out.println((char) entry[0] + " : " + entry[1]);
        }
    }
}

