package level1;

import java.util.Scanner;

public class uppercase {
    public static String Toupper(String s){
        String str1 = "";
        for(int i =0;i<s.length();i++)
        {
            int ascii = s.charAt(i);
            if(ascii>=97 && ascii<=122)
            {
                str1+= (char) (ascii-32);
            }
            else {
                str1+= s.charAt(i);
            }
        }
        return str1;
    }
    public static boolean compareString(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return  true;
    }
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scan.next();
        String s1 = Toupper(s);
        String s2 = s.toUpperCase();
        System.out.println(s1+" is using user function");
        System.out.println(s2+" is using in built function");
        System.out.println("Are both equal ?:"+compareString(s1,s2));
    }
}
