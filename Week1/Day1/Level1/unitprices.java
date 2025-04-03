import java.util.Scanner;
class unitprices{
	public static void main(String[]args){
		double unitprice,quantity,totalprice;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter unitprice value :");
		unitprice = input.nextDouble();
		System.out.println("Enter quantity value :");
		quantity = input.nextDouble();
		totalprice = unitprice*quantity;
		System.out.println("the total purchase price is INR "+totalprice+" if the quantity "+quantity+ " and the unit price is INR " + unitprice);
		}
	}