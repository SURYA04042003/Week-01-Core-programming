import java.util.Scanner;
class prime{
	public static void main(String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		boolean isPrime = false;
		if(number >1)
		{
			for(int i =2;i< number;i++)
			{
				if(number%i ==0)
				{
					isPrime = true;
					break;
				}
				else{
				  isPrime = false;
				  continue;
				}
			}
		}
		else{
			System.out.println("Enter the number greater than 1 ");
		}
		if (isPrime)
		{
			System.out.println("The given number is not Prime number");
		}
		else{
			System.out.println("The given  number is Prime number");
		}
	}
}