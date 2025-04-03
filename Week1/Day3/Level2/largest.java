import java.util.Scanner;
class largest{
	public static void main(String[] args){
		int number;
		int maxDigit = 10;
		int largest=0;
		int second =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		int [] digits = new int[maxDigit];
		int index =0;
		while(number !=0 && index <maxDigit)
		{
			digits[index] = number%10;
			index++;
			number/=10;
		}
			for(int i=0;i<digits.length;i++)
			{
				if(digits[i]>largest)
				{
					 second = largest;
					largest = digits[i]; 
				}
				else if((digits[i]>second )&&(digits[i] !=largest))
				{
						second = digits[i];
				}
			}
			System.out.println("The largest number is :" + largest);
			System.out.println("The second largest number is :"+second);
		}
	}
