import java.util.Scanner;
class bonus {
	public static void main(String[] args){
		double salary,bonus,totalincome;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the salary :");
		salary = input.nextDouble();
		System.out.println("Enter the bonus value :");
		bonus = input.nextDouble();
		totalincome = salary+bonus;
		System.out.println("The salary is INR " + salary + " and bonus is INR "+bonus + " .Hence Total Income is INR " + totalincome);
		}
	}
		