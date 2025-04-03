import java.util.Scanner;
class athlete{
	public static void main(String [] args){
		int side1,side2,side3,perimeter,distance;
		double rounds;
		distance = 5*1000;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of side1:");
		side1 = input.nextInt();
		System.out.println("Enter the value of side2: ");
		side2 = input.nextInt();
		System.out.println("Enter the value of side3 :");
		side3 = input.nextInt();
		perimeter = side1+side2+side3;
		rounds = distance/perimeter;
		System.out.println(" The total number of rounds the athlete will run is " + rounds + " to complete 5km");
		}
	}