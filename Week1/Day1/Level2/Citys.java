import  java.util.Scanner;
class Citys{
	public static void main(String [] args){
		String urname,fromCity,viaCity,toCity;
		double  distancesfromToVia,distancesviaToFinalCity,totaldistance;
		int timeFromVia,timeViaToFinalCity,totaltime;
		Scanner input = new Scanner(System.in);
		Systm.out.println("Enter ur name:");
		urname = input.nextLine();
		System.out.println("Enter from which city have to go :");
		fromCity = input.nextLine();
		System.out.println("Enter the city to which u need to go: ");
		toCity = input.nextLine();
		System.out.println("Enter city through which u will go:");
		viaCity = input.nextLine();
		System.out.println("Enter the distancesfromToVia:");
		distancesfromToVia = input.nextDouble();
		System.out.println("Enter the distancesviaToFinalCity: ");
		distancesviaToFinalCity = input.nextDouble();
		System.out.println("Enter the timeFromVia city:");
		timeFromVia = input.nextInt();
		System.out.println("Enter the timeViaToFinalCity :");
		timeViaToFinalCity = input.nextInt();
		totaldistance = distancesfromToVia+distancesviaToFinalCity;
		totaltime = timeFromVia + timeViaToFinalCity;
		System.out.println("The Total Distance travelled by " + urname + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totaldistance + " km and " +
                         "the Total Time taken is " + totaltime + " hrs");
		}
	}

		

		
		