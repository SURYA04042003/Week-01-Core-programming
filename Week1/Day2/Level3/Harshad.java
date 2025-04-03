import java.util.Scanner;
class Harshad {
	public static void main(String[] args){
		int number,sum =0,digit,original;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		original = number;
		while(original !=0)
		{
			digit = original%10;
			sum += digit;
			original = original/10;
		}
		if (number%sum == 0){
			System.out.println("The given number is Harshad number");
		}
		else{
			System.out.println("The given number is not Harshad number");
		}
	}
}
			