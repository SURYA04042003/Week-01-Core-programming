import java.util.Scanner;
class Reverse{
	public static void main(String[] args){
		int number ;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		int temp = number;
		while(temp>0)
		{	
			count++;
			temp = temp/10;
		}
		int [] digits = new int[count];
		for(int i=0;i<count;i++)
		{
			temp = number%10;
			digits[i] = temp;
			number = number/10;
		}
		System.out.println("The reversed order:");
		for (int i=0;i<digits.length;i++)
		{
			System.out.println(digits[i]);
		}
	}
}
		