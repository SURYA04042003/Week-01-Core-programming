package level2;

import java.util.Scanner;

public class length {
    public static int Tocount(String str){
        int count =0;
            try{
                while (true){
                    str.charAt(count);
                    count++;
                }
            }catch (StringIndexOutOfBoundsException e)
            {
                return count;
            }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scan.next();
        int Str1 = Tocount(str);
        int Str2 = str.length();
        System.out.println("Both are equal: "+(Str1==Str2));
    }
}
