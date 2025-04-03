import java.util.Scanner;
class armstrong{
	public static void main(String [] args){
		int number,originalnumber,sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		originalnumber = number;
		while(originalnumber !=0){
			int digit = originalnumber%10;
			sum += digit*digit*digit;
			originalnumber = originalnumber/10;
		}
		if(sum == number){
			System.out.println("The given number is Armstrong");
		}
		else{
			System.out.println("The given number is not Armstrong");
			}
	}
}
