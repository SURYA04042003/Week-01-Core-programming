import java.util.Scanner;
class natural{
	public static void main(String[] args){
		int number,sum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = input.nextInt();
		if(number > 0){
			sum = number*(number + 1 )/2;
			System.out.println("The sum of "+ number + "natural number is " + sum);
			}
		else{
			System.out.println("The number "+ number + " is not a natural number");
			}
		}
}