import  java.util.Scanner;
class City{
	public static void main(String [] args){
		String urname,fromCity,viaCity,toCity;
		double  distancesfromToVia,distancesviaToFinalCity,totaldistance;
		int timeFromVia,timeViaToFinalCity,totaltime;
		Scanner input = new Scanner(System.in);
		urname = input.nextLine();
		fromCity = input.nextLine();
		toCity = input.nextLine();
		viaCity = input.nextLine();
		distancesfromToVia = input.nextDouble();
		distancesviaToFinalCity = input.nextDouble();
		timeFromVia = input.nextInt();
		timeViaToFinalCity = input.nextInt();
		totaldistance = distancesfromToVia+distancesviaToFinalCity;
		totaltime = timeFromVia + timeViaToFinalCity;
		System.out.println("The Total Distance travelled by " + urname + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totaldistance + " km and " +
                         "the Total Time taken is " + totaltime + " hrs");
		}
	}

		

		
		