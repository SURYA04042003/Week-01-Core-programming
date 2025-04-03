import java.util.Scanner;
class counter{
	public static void main(String [] args)
	{
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		int counter = 100;
		while(counter >=1)
		{
			if(counter % number ==0)
			{
				System.out.println(counter);
			}
			counter--;	
			continue;
		}
	}
}
