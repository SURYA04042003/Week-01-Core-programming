import java.util.Scanner;
class multiples{
	public static void main(String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number less than 100 :");
		number = input.nextInt();
		if(number >0)
		{
			for(int i = 100 ;i>=1;i--)
			{
				if(number % i ==0)
				{
					System.out.println(i);
				}
				continue;
			}
		}
		else{
			System.out.println("Enter positive number");
		}
	}
}