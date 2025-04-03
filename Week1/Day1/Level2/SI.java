import java.util.Scanner;
class SI{
	public static void main(String[] args){
		int principal,rate,time,simpleinterest;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principal value :");
		principal = input.nextInt();
		System.out.println("Enter the rate value :");
		rate = input.nextInt();
		System.out.println("Enter the time: ");
		time = input.nextInt();
		simpleinterest = principal*rate*time / 100;
		System.out.println("The Simple Interst is "+ simpleinterest + "for Principal " + principal + " , Rate of interest " + rate + " and time " + time);
		}
		}