package level2;

import java.util.Scanner;

public class unitconvertor3 {
        public static double convertFarhenheitToCelsius(double farhenheit){
            double cel = (farhenheit - 32) * 5 / 9;;
            return cel;
        }
        public static double convertCelsiusToFarhenheit(double celsius){
            double farhen =(celsius * 9 / 5) + 32;
            return farhen;
        }
        public static double convertpoundstokilograms(double pound){
            double kilogram = pound *  0.453592;
            return kilogram;
        }
        public static double  convertkilogramtopounds(double kilogram){
            double pound = kilogram *  2.20462;;
            return  pound;
        }
        public static double convertgallonstoliters(double gallons){
            double liter = gallons * 3.78541;
            return  liter;
        }
        public static double convertliterstogallons(double liter){
            double gallons = liter * 0.264172;
            return  gallons;
        }

        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter fahrenheit : ");
            double fahrenheit = input.nextDouble();
            System.out.println("Enter Celsius : ");
            double celsius = input.nextDouble();
            System.out.println("Enter kilogram : ");
            double kilogram = input.nextDouble();
            System.out.println("Enter liter : ");
            double liter = input.nextDouble();
            System.out.println("Enter pounds :");
            double pound = input.nextDouble();
            System.out.println("Enter gallons :");
            double gallons = input.nextDouble();
            double cel =  convertFarhenheitToCelsius(fahrenheit);
            double fahren = convertCelsiusToFarhenheit(celsius);
            double  kg = convertpoundstokilograms(pound);
            double  pounds= convertkilogramtopounds(kilogram);
            double gallon = convertliterstogallons(liter);
            double liters = convertgallonstoliters(gallons);
            System.out.println("The given fahrenheit to celsius :"+cel);
            System.out.println("The given Celsius to fahrenheit :"+ fahren);
            System.out.println("The given pounds to kg : "+kg);
            System.out.println("The given kg to pounds : "+pounds);
            System.out.println("The given liters to gallons : "+gallon);
            System.out.println("The given gallons to liters :" + liters);
        }
    }


