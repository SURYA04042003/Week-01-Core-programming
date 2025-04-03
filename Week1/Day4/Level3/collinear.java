package level3;

import java.util.Scanner;

public class collinear {
    public static boolean col(int x1,int y1,int x2,int y2,int x3, int y3){
        int slopeAB = (y2-y1)/(x2-x1);
        int slopeBC = (y3-y2)/(x3-x2);
        int slopeAC = (y3-y1)/(x3-x1);
        return (slopeAB==slopeBC)&&(slopeBC==slopeAC);
    }
    public static boolean triangle(int x1,int y1,int x2,int y2,int x3,int y3){
        double area = 0.5*(x1* (y2-y3)+x2 * (y3-y1)+x3*(y1-y2));
        return area==0;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = input.nextInt();
        System.out.println("Enter y1: ");
        int y1 = input.nextInt();
        System.out.println("Enter x2: ");
        int x2 = input.nextInt();
        System.out.println("Enter y2: ");
        int y2 = input.nextInt();
        System.out.println("Enter x3: ");
        int x3 = input.nextInt();
        System.out.println("Enter y3: ");
        int y3 = input.nextInt();
        System.out.println("The given points are collinear : "+col(x1,y1,x2,y2,x3,y3));
        System.out.println("The area of the triangle formed by three points is 0 :" + triangle(x1,y1,x2,y2,x3,y3));
    }
}
