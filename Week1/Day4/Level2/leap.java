package level2;

import java.util.Scanner;

public class leap {
    public static boolean leapyear(int year) {
        if (year < 1582) {
            System.out.println("Enter year greater than or equal to 1582.");
            return false;
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        boolean ischeck = leapyear(year);
        if(ischeck){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not Leap year");
        }
    }
}

