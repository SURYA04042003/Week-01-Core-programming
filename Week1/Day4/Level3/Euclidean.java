package level3;

import java.util.Scanner;

public class Euclidean {
    public static int distance(int x1,int y1,int x2,int y2){
        int difference = x2-x1;
        int difference1 = y2-y1;
        int square1root = (int)Math.sqrt((int)Math.pow(difference,2));
        int square2root = (int)Math.sqrt((int)Math.pow(difference1,2));
        return square1root+square2root;
    }
    public static int [] slop(int x1,int y1,int x2,int y2){
        int m=(y2-y1)/(x2-x1);
        int b = y1-m*x1;
        int []array = new int[2];
        array[0]=m;
        array[1] = b;
        return array;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 point:");
        int x1 = input.nextInt();
        System.out.println("Enter y1 point: ");
        int y1 = input.nextInt();
        System.out.println("Enter x2 point: ");
        int x2 = input.nextInt();
        System.out.println("Enter y2 point: ");
        int y2 = input.nextInt();
        System.out.println("The distance between two points :"+distance(x1,y1,x2,y2));
        int []slops = slop(x1,y1,x2,y2);
        System.out.println("The slop is "+ slops[0]);
        System.out.println("The y-intercept b is "+ slops[1]);
    }
}
