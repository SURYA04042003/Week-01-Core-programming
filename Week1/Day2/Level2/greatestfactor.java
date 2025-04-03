import java.util.Scanner;
class greatestfactor{
	public static void main(String[] args){
		int number,greatestfactor=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number greater than 1 :");
		number = input.nextInt();
		for(int i = number - 1;i >=1;i--)
		{
			if(number%i==0)
			{
				greatestfactor = i;
				break;
			}
		System.out.println("The greatestfactor is "+greatestfactor);
		}
	}
}
				