import java.util.Scanner;
class Height{
	public static void main(String [] args){
		int cmheight;
		double feet,inch;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the height in centimeter :");
		cmheight = input.nextInt();
		inch = (double)cmheight/2.54;
		feet = inch/12;
		System.out.println("Your Height in cm is " +cmheight+ "while in feet is " + String.format("%.2f"+feet)+ "and the inches is " + String.format("%.2f"+inch);
		}
	}