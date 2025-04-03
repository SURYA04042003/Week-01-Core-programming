import java.util.Scanner;
class Divisible{
	public static void main(String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		if(number% 5 == 0){
			System.out.println("Is the number "+number + " divisible by 5 ? YES");
		}
		else{
			System.out.println("Is the number "+number + " divisible by 5 ? NO");
			}
		}
	}