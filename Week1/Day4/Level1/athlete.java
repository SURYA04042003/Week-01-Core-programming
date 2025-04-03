import java.util.Scanner;

public class athlete {
    public static double perimeter(double side1,double side2,double side3){
        double perimeterOftriangle = side1 + side2+side3;
        return perimeterOftriangle;
    }
    public static double rounds(double perimeterOftriangle,double distance)
    {
        double dis = distance*1000;
        double round = dis/perimeterOftriangle;
        return round;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1:");
        double side1 = input.nextDouble();
        System.out.println("Enter side 2:");
        double side2 = input.nextDouble();
        System.out.println("Enter side 3:");
        double side3 = input.nextDouble();
        System.out.println("Enter the distance:");
        double distance = input.nextDouble();
        double perimeter = perimeter(side1,side2,side3);
        double NoOfRound = rounds(perimeter,distance);
        System.out.println("The no of rounds is:" + NoOfRound);
    }
}
