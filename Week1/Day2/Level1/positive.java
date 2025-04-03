import java.util.Scanner;
class positive{
	public static void main(String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		if(number == 0)
		{
			System.out.println(" zero");
		}
		else if(number > 0)
		{
			System.out.println("positive");
		}
		else 
		{
			System.out.println("negative");
		}
	}
}
		