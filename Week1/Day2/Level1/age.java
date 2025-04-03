import java.util.Scanner;
class age{
	public static void main(String[] args){
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age :");
		age = input.nextInt();
		if ( age >= 18){
			System.out.println("The person can vote ");
		}
		else{
			System.out.println("The person cannot vote ");
		}
	}
}