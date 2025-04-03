import java.util.Scanner;
class sum{
	public static void main(String[] args){
		double total = 0,number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextDouble();
		while(number != 0)
		{
			total += number;
			System.out.println("Enter the number :");
			number = input.nextDouble();
		}
		System.out.println("The total is " + total);
	}
}