import java.util.Scanner;
class multiplication{
	public static void main(String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		for(int i=6 ;i<=9;i++){
			System.out.println(number + "*"+ i + "="+ (number *i));
		}
	}
}