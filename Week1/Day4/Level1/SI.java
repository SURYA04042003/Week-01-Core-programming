package level1;

import java.security.Principal;
import java.util.Scanner;

public class SI {
    public static double simpleinterest(double principal, double rate, double time) {
        double Simple = principal * rate * time / 100;
        return Simple;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal:");
        double principal = input.nextDouble();
        System.out.println("Enter the rate:");
        double rate =input.nextDouble();
        System.out.println("Enter the time:");
        double time = input.nextDouble();
        double SimpleInterest = simpleinterest(principal,rate,time);
        System.out.println("Simple interest is :"+SimpleInterest+" for Principal "+ principal+" ,Rate of Interest"+ rate+ "and time"+time);
}
}
