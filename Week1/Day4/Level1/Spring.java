import java.util.Scanner;

public class Spring {
    public static boolean check(int month,int date){
        boolean isSpring = false ;
        if(month>=3 && month<=6)
        {
            if (date >= 20 && date <= 31){
            isSpring = true;
        }
        }
        else {
            isSpring = false;
        }
        return isSpring;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month in number :");
        int month = input.nextInt();
        System.out.println("Enter the date : ");
        int date = input.nextInt();
        boolean results = check( month,date);
        System.out.println("the result is :"+ results);
    }
}
