package level1;

import java.util.Scanner;

public class trigonometric {
    public static double [] calculateTrigonometricFunctions(double angle){
        double radian = Math.toRadians(angle);
        double sine = Math.sin(radian);
        double cosine = Math.cos(radian);
        double tangent = Math.tan(radian);
        double [] angles = new double[3];
        angles [0] = sine;
        angles[1] = cosine;
        angles [2]=tangent;
        return angles;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the angle");
        double angle = input.nextDouble();
        double [] result = calculateTrigonometricFunctions(angle);
        System.out.println("The sine of the given number :" + String.format("%.2f",result[0]));
        System.out.println("The cosine of the given number :" + String.format("%.2f",result[1]));
        System.out.println("The tangent of the given number : "+String.format("%.2f",result[2]));
    }
}
