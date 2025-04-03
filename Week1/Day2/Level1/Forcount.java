import java.util.Scanner;
class Forcount{
	public static void main(String[] args){
		int countdown;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the countdown : ");
		countdown = input.nextInt();
		for(int i = countdown ;i>=1;i--)
		{
			System.out.println("Countdown :"+ i);
		}
	}
}