package level1;

import java.util.Scanner;

public class substring {
    public static String sub(String str,int start,int end){
        String subs ="";
        for(int i=start;i<end;i++){
            subs += str.charAt(i);
        }
        return subs;
    }
    public static boolean substrings(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one string: ");
        String str = scan.next();
        System.out.println("Enter starting index: ");
        int start = scan.nextInt();
        System.out.println("Enter ending index : ");
        int end = scan.nextInt();
        String str1 = sub(str,start,end);
        System.out.println("The substring done manually : "+ str1);
        String str2 = str.substring(start,end);
        System.out.println("The substring done by builtin: " + str2);
        System.out.println("Both inbuilt and manual are same :" + substrings(str1,str2));


    }
}
