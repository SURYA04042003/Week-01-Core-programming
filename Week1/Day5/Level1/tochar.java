package level1;

import java.util.Arrays;
import java.util.Scanner;

public class tochar {
    public static char[] getCharacters (String str){
        char[] charArray  = new char[str.length()];
        for(int i=0;i<str.length();i++){
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    public static boolean compareCharArrays(char[] arr1,char[]arr2){
        if(arr1.length != arr2.length)
            return false;
        for(int i= 0 ;i<arr1.length;i++){
            if(arr1[i]!= arr2[i])
                return false;
        }
        return true;
    }
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter String :");
        String str = scan.next();
        char[] manualcal = getCharacters(str);
        System.out.println("character from manually: "+ Arrays.toString(manualcal));
        char [] builtInchar =str.toCharArray();
        System.out.println("Characters from built-in"+Arrays.toString(builtInchar));
        boolean areEqual = compareCharArrays(manualcal,builtInchar);
         System.out.println("both are equal:" + areEqual);

    }
}
