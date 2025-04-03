package level2;

import java.util.Scanner;

public class vowel {
    public static String checkChecker(char ch){
        ch = Character.toLowerCase(ch);
        if(ch=='a'||ch == 'e'|| ch =='i'||ch =='o'||ch =='u'){
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        else {
            return "Not a Letter";
        }
    }
    public static int[] countVowelsAndConsonants(String str){
        int vowelCount =0;
        int consonantCount = 0;
        int stringLength = str.length();

        for(int i=0;i<stringLength;i++){
            char currentChar = str.charAt(i);
            String charType = checkChecker(currentChar);
            if(charType.equals("Vomel")){
                vowelCount++;
            } else if (charType.equals("Consonant")) {
                consonantCount++;
            }
        }
        int[]counts = new int[2];
        counts[0] = vowelCount;
        counts[1] = consonantCount;
        return counts;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        int[] resultCounts = countVowelsAndConsonants(inputString);
        System.out.println("Vowel Count: "+ resultCounts[0]);
        System.out.println("Consonant Count: "+ resultCounts[1]);
    }
}
