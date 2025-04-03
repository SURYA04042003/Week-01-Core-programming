import  java.util.Scanner;
class whilepower{
	public static void main(String [] args){
		int number,power,result =1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		System.out.println("Enter the power :");
		power = input.nextInt();
		int counter =0;
		while( counter< power)
		{
			result *= number;
			counter++;
		}
		System.out.println("The result is" + result);
		}
	}
	