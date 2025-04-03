import java.util.Scanner;
class kmtomiles{
	public static void main(String [] args){
		double km,miles;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the kilometer :");
		km = input.nextInt();
		miles = km *1.6;
		System.out.println("The total miles is " + miles+ " miles for the given " + km +"km");
		}
	}
		