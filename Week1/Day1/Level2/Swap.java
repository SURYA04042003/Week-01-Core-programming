import java.util.Scanner;
class Swap{
	public static void main(String [] args){
		int num1,num2,temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1 value :");
		num1 = input.nextInt();
		System.out.println("Enter num2 value: ");
		num2 = input.nextInt();
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("The swapped numbers are " + num1 + " and" + num2);
		}
	}