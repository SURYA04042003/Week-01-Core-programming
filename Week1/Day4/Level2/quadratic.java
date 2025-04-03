package level2;

import java.util.Scanner;

public class quadratic {
    public static void root(double a,double b,double c){
        double delta = Math.pow(b,2)+4 * a*c;
        if(delta>0){
            double result1= (-b + Math.sqrt(delta))/(2*a);
            double result2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.print("The roots are:"+ String.format("%.2f",result1)+", "+String.format("%.2f",result2));
        } else if (delta==0) {
            double result1 = -b/(2*a);
            System.out.print("The root is: "+result1);
        }
        else{
            System.out.print("delta is negative");
        }
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value for b : ");
        double b = input.nextDouble();
        System.out.print("Enter the value for c :");
        double c = input.nextDouble();
        root(a,b,c);
    }
}
