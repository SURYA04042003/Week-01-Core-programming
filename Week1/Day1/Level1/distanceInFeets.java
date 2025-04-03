import java.util.Scanner;
class distanceInFeets{
	public static void main(String [] args){
		double distanceInFeet,distanceInYards,distanceInMiles;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance in feet :");
		distanceInFeet = input.nextDouble();
		distanceInYards = (int)distanceInFeet/3;
		distanceInMiles = (int)distanceInYards/1760;
		System.out.println("The distance in feets is " + distanceInFeet + " and in yards is " + distanceInYards + " and in miles " + distanceInMiles);
		}
	}