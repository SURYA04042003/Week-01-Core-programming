package level2;

import java.util.Scanner;

public class unitconvertor1 {
    public static double convertkmToMiles(double km) {
        double kmtomiles = km * 0.621371;
        return kmtomiles;
    }

    public static double convertmilestokilometers(double miles) {
        double miles2km = miles * 1.60934;
        return miles2km;
    }

    public static double convertmeterstofeet(double meter) {
        double meters2feet = meter * 3.28084;
        return meters2feet;
    }

    public static double convertfeettometers(double feet) {
        double feet2meters = feet * 0.3048;
        return feet2meters;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter kilometer :");
        double km = input.nextDouble();
        System.out.println("Enter miles :");
        double miles = input.nextDouble();
        System.out.println("Enter meter :");
        double meter = input.nextDouble();
        System.out.println("Enter feet :");
        double feet = input.nextDouble();
        double mile = convertkmToMiles(km);
        double feets = convertmeterstofeet(meter);
        double meters = convertfeettometers(feet);
        double kilom = convertmilestokilometers(miles);
        System.out.println("The given km to miles : "+mile);
        System.out.println("The given miles to km : "+kilom);
        System.out.println("The given feet to meter : "+meters);
        System.out.println("The given meter to feet : "+feets);

    }

}