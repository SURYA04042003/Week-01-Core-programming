package level1;

import java.util.Scanner;

public class IIegalArugement {
    public static String generateexception(String str,int start ,int end){
        return str.substring(start,end);
    }
    public static void handleexception(String str,int start,int end){
        try{
            System.out.println(str.substring(start,end));
        }catch (IllegalArgumentException e){
            System.out.println("Caught an illegalArugementException: "+ e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Caught a Runtime Exception : "+e.getMessage());
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.next();
        System.out.print("Enter start index(greater than end index) : ");
        int start = scan.nextInt();
        System.out.print("Enter end index : ");
        int end = scan.nextInt();
        //generate(str,start,end);
        handleexception(str,start,end);
    }
}
