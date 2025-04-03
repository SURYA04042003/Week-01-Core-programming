import java.util.Scanner;
class Leapyears{
	public static void main(String[] args){
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year which is above or equal to 1582 :");
		year = input.nextInt();
		if((year % 4 == 0 && year % 100 ==0) ||(year% 400 ==0)){
			System.out.println("The given number is leap year ");
		}
		else{
			System.out.println("The given number is not leap year ");
		}
	}
}