import java.util.Scanner;
class countdown{
	public static void main(String[] args){
		int count;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coundown :");
		count = input.nextInt();
		while(count>= 1)
		{
			System.out.println("Countdown : " + count );
			count--;
		}
	}
}