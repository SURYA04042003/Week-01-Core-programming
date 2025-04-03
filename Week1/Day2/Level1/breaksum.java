import java.util.Scanner;
class breaksum{
	public static void main(String[] args){
		double total = 0,number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextDouble();
		while(true)
		{
			if(number ==0 || number <0 )
			{
				break;
			}
			else{
				total += number;
				System.out.println("Enter the number :");
				number = input.nextDouble();
		       }
			   if(number ==0 || number <0 )
			{
				break;
			}
		}
		System.out.println("The total is " + total);
		
	}
}

