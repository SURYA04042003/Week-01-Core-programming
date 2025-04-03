import java.util.Scanner;
class employees{
	public static void main(String [] args){
		int salary,year;
		double bonus =0.05;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your salary :");
		salary = input.nextInt();
		System.out.println("Enter your year of service :");
		year = input.nextInt();
		if(year> 5){
		bonus = 0.05*salary;
		System.out.println("The bonus amount is " + bonus);
		}
		else{
			System.out.println("Sorry,you dont have bonus");
		}
	}
}
			