import java.util.Scanner;

public class frequency2d {
    public static int findLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[][] findCharacterFrequency(String str) {
        int length = findLength(str);
        char[] characters = str.toCharArray();
        int[] frequencies = new int[length];

        for (int i = 0; i < length; i++) {
            if (characters[i] == '0') {
                continue;
            }
            frequencies[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequencies[i]++;
                    characters[j] = '0';
                }
            }
        }

        int uniqueCount = 0;
        for (int freq : frequencies) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (frequencies[i] > 0) {
                result[index][0] = String.valueOf(characters[i]);
                result[index][1] = String.valueOf(frequencies[i]);
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

        String[][] frequency = findCharacterFrequency(input);
        System.out.println("Character Frequency:");
        for (String[] entry : frequency) {
            System.out.println(entry[0] + " : " + entry[1]);
        }
    }
}
