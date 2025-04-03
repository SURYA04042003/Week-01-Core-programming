import java.util.Scanner;
class Chocolate{
	public static void main(String[] args){
		int numberofchocolate,numberofchildren,remaining,remainingchocolate,distribution;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of chocolates : ");
		numberofchocolate = input.nextInt();
		System.out.println("Enter the number of students :");
		numberofchildren = input.nextInt();
		remaining = numberofchocolate % numberofchildren;
		remainingchocolate = numberofchocolate-remaining;
		distribution = remainingchocolate/numberofchildren;
		System.out.println("The number of chocolates each child gets is " + distribution + " and the number of remaining chocolates are " + remaining);
		}
		}