package level2;

import java.util.Scanner;

public class unitconvertor2 {
    public static double convertYardsToFeet(double yards){
        double feet = yards*3;
        return feet;
    }
    public static double convertfeetToyards(double feet){
        double yard = feet * 0.333333;
        return yard;
    }
    public static double convertmeterstoinch(double meter){
        double inch = meter*39.3701;
        return inch;
    }
    public static double  convertinchestometers(double inch){
        double meter = inch * 0.0254;
        return  meter;
    }
    public static double convertinchestocentimeters(double inch){
        double centimeter = inch*2.54;
        return  centimeter;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yards : ");
        double yards = input.nextDouble();
        System.out.println("Enter feet : ");
        double feet = input.nextDouble();
        System.out.println("Enter meter : ");
        double meter = input.nextDouble();
        System.out.println("Enter inch : ");
        double inch = input.nextDouble();
        double f = convertYardsToFeet(yards);
        double cm = convertinchestocentimeters(inch);
        double  m = convertinchestometers(inch);
        double in = convertmeterstoinch(meter);
        double y = convertfeetToyards(feet);
        System.out.println("The given yards to feet :"+f);
        System.out.println("The given inches to centimeter :"+cm);
        System.out.println("The given inches to meter : "+m);
        System.out.println("The given meter to inch : "+in);
        System.out.println("The given feet to yards : "+y);
    }
}
