import java.util.Scanner;
class Leapyear{
	public static void main(String[] args){
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year which is above or equal to 1582 :");
		year = input.nextInt();
		if(year % 4 == 0){
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					System.out.println("The given year is leap year ");
				}
				else{
					System.out.println("The given year is not leap year ");
				} 
			}
			else{
				System.out.println("The given year is not leap year ");
			} 
		}
		else{
			System.out.println("The given year is not leap year ");
		 }
	 }
}
