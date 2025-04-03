import java.util.Scanner;
class digitcount{
	public static void main(String[] args){
		int number,count = 0,digit ,original;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		original = number;
		while(original !=0){
			digit = original/10;
			count += 1;
			original = digit;
		}
		System.out.println("the count is :"+ count);
	}
}
			