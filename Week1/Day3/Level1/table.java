import java.util.Scanner;
class table{
	public static void main(String []args){
		int number;
		int [] multiplicationResult = new int[4];
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number");
		number = input.nextInt();
		for(int i=6;i<=9;i++)
		{
			multiplicationResult[i-6] = number*i;
		}
		System.out.println("The multiplication table is :");
		for(int i = 6;i<=9;i++)
		{
			System.out.println(number + "*" +i + "=" + multiplicationResult[i-6]);
		}
	}
}