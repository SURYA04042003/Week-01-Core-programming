package level2;

import java.util.Scanner;

public class vowel2d {
    public static String getCharacter(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            ch =(char)(ch +32);
        }
        if(ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }else{
                return "Not letter";
            }
        }
        public static String[][] analyzeCharacter(String text){
            String[][] charAnalysis = new String[text.length()][2];
            for(int i=0;i< text.length();i++){
                char ch = text.charAt(i);
                charAnalysis[i][0] = String.valueOf(ch);
                charAnalysis[i][1] = getCharacter(ch);
            }
            return charAnalysis;
        }
        public static void displayCharacteerAnalysis(String[][] charAnalysis){
            System.out.println("\nCharacter\tType");
            for (String[] row : charAnalysis) {
                System.out.println(row[0] + "\t\t" + row[1]);
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String inputText = scanner.nextLine();
            scanner.close();

            String[][] charAnalysis = analyzeCharacter(inputText);
            displayCharacteerAnalysis(charAnalysis);

    }
}
