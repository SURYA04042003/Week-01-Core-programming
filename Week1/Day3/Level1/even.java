import java.util.Scanner;
public class even{
	public static void main(String [] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		if(number <=0)
		{
			System.out.println("Error");
			return;
		}
			int size = number/2 +1;
			int [] evenarray = new int[size];
			int [] oddarray = new int[size];
			int odd = 0,even = 0;
			for(int i =1;i<=number;i++)
			{
				if(i%2==0)
				{
					evenarray[even] = i;
					even++;
				}
				else
				{
					oddarray[odd] = i;
					odd++;
				}
			}
		
		System.out.println("The even array :");
		for (int i = 0;i< even;i++)
		{
			System.out.print(evenarray[i]+ " ");
		}
		System.out.println();
		System.out.println("The odd array :");
		for (int i = 0;i< odd;i++)
		{
			System.out.print(oddarray[i]+ " ");
		}
		
	}
}	
		