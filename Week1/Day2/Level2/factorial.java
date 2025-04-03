import java.util.Scanner;
class factorial{
	public static void main(String[] args){
		int num,factorial=1,i=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = input.nextInt();
		if(num > 0)
		{
			while(i<=num)
			{
				factorial *=i;
				i++;
			}
		}
		else{
			System.out.println("The number is not positive");
			}
		System.out.println("The factorial is : " + factorial);
	}
}