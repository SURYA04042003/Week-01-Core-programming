import java.util.Scanner;
class Quotient{
	public static void main(String [] args){
		int num1,num2,reminder;
		float quotient;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1 value :");
		num1 = input.nextInt();
		System.out.println("Enter num2 value: ");
		num2 = input. nextInt();
		reminder = num1 %num2;
		quotient = num1/num2;
		System.out.println("The Quotient is " + quotient+ "and Reminder is " + reminder+ "of two number "+ num1 + "and" +num2);
		}
		}
		
		