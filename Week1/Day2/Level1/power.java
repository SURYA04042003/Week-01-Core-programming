import  java.util.Scanner;
class power{
	public static void main(String [] args){
		int number,power,result =1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		System.out.println("Enter the power :");
		power = input.nextInt();
		for ( int i =1;i<=power;i++)
		{
			result *=i;
		}
		System.out.println("The result is" + result);
		}
	}
	