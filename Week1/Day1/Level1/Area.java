import java.util.Scanner;
class Area{
	public static void main(String[] args){
		double base,height,area,base1,height1,inch,area1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base value :");
		base = input.nextFloat();
		System.out.println("Enter the height value :");
		height = input.nextFloat();
		area = 0.5*base*height;
		base1 = base /2.54;
		height1 = height/2.54;
		area1 = 0.5*base1*height1;
		System.out.println("Area of triangle in square centimeter " +area+" and area of triangle in square inches" + area1);
		}
	}
		
		
		