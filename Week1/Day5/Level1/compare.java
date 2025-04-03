package level1;

import java.util.Scanner;

public class compare {
    public static boolean manualcompare(String s1, String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one string: ");
        String s1 = scan.next();
        System.out.println("Enter another string :");
        String s2 = scan.next();
        boolean builtin = s1.equals(s2);
        boolean manual = manualcompare(s1,s2);
        if(builtin==manual){
            System.out.println("Both strings are equal");
        }else {
            System.out.println("Both strings are not same");
        }
    }

}
