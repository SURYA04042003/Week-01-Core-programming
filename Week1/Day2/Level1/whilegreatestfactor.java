import java.util.Scanner;
class whilegreatestfactor{
	public static void main(String[] args){
		int number,greatestfactor=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number greater than 1 :");
		number = input.nextInt();
		int counter = number - 1;
		while(counter >=1)
		{
			if(number%counter==0)
			{
				greatestfactor = counter;
				break;
			}
			counter--;
		}
		System.out.println("The greatestfactor is "+greatestfactor);

		}
	}

	