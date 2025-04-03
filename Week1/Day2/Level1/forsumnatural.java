import java.util.Scanner;
class forsumnatural{
	public static void main(String [] args){
		int number,sum= 0,result=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = input.nextInt();
		if(number>0){
			for(int i = 1;i<= number;i++){
				sum += i;
			}
		}
		else{
			System.out.println("The number is not natural number");
		}
		result = number * (number+1)/2;
		if(sum == result){
			System.out.println("Correct");
		}
	}
}

		
		
		
		