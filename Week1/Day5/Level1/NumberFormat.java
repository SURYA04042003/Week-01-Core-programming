package level1;

import java.util.Scanner;

public class NumberFormat {
    public static int generateException(String str){
        return Integer.parseInt(str);
    }
    public static void handleException(String str){
        try {
            System.out.println(Integer.parseInt(str));
        }catch (NumberFormatException e){
            System.out.println("Caught a NumberFormatException" + e.getMessage());
        }catch (RuntimeException e){
            System.out.println("RuntimeException" + e.getMessage());
        }
    }
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.next();
        //generateException(str);
        handleException(str);
    }
}
