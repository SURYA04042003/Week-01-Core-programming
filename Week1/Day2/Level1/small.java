import java.util.Scanner;
class small{
	public static void main(String [] args){
		int number1,number2,number3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number1 value :");
		number1 = input.nextInt();
		System.out.println("Enter the number2 value :");
		number2 = input.nextInt();
		System.out.println("Enter the number3 value :");
		number3 = input.nextInt();
		if(number1<number2 && number1<number3){
			System.out.println("Is the first number the smallest? YES ");
			}
		else{
			System.out.println("Is the first number the smallest? NO ");
			}
	}
}