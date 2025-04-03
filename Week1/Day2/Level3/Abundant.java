import java.util.Scanner;
class Abundant{
	public static void main(String[] args){
		int number,sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		for(int i = 1;i< number;i++){
			if(number%i == 0)
			{
				sum += i;
			}
			else{
				continue;
			}
		}
		if (sum > number){
			System.out.println("The given number is Abundant number");
			}
		else{
			System.out.println("The given nuumber is not Abundant number");
		}
	}
}