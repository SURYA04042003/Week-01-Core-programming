import java.util.Scanner;
class compare{
	public static void main(String [] args){
		int number1,number2,number3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1 value :");
		number1 = input.nextInt();
		System.out.println("Enter number2 value :");
		number2 = input.nextInt();
		System.out.println("Enter number3 value :");
		number3 = input.nextInt();
		if(number1>number2 && number1 > number3){
			System.out.println("Is the first number the largest? YES");
			System.out.println("Is the second number the largest? NO");
			System.out.println("Is the third number the largest? NO");
		}
		else if(number1 < number2 && number2 > number3){
			System.out.println("Is the first number the largest? NO");
			System.out.println("Is the second number the largest? YES");
			System.out.println("Is the third number the largest? NO");
		}
		else {
			System.out.println("Is the first number the largest? NO");
			System.out.println("Is the second number the largest? NO");
			System.out.println("Is the third number the largest? YES");
		}
	}
}
			