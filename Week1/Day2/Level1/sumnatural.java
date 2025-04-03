import java.util.Scanner;
class sumnatural{
	public static void main(String [] args){
		int number,sum =0,result= 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		int i = 1;
		if(number>0){
			while(i<= number)
			{
				sum += i;
				i++;
			}
		result = number * (number+1) / 2;
		} 
		if(sum == result){
		System.out.println("Correct");
		}
	}
}
		