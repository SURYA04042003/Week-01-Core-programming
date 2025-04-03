import java.util.Scanner;
class positive{
	public static void main(String[] args){
		int [] num = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers :");
		for(int i = 0;i<5;i++)
		{
			num[i] = input.nextInt();
		}
		for(int i = 0;i < num.length;i++)
		{
			if(num[i]>0)
			{
				System.out.println(" the number  "+ num[i]+ "is Positive");
			}
			else if(num[i] <0)
			{
				System.out.println("the number "+num[i] + "is negative");
			}
			else 
			{
				System.out.println("the number "+ num[i]+ " is zero");
			}
		}
		System.out.println();
		for (int i = 0 ;i<num.length;i++){
			if(num[i] %2==0)
			{
				System.out.println("the number "+num[i] + "is even");
			}
			else{
				System.out.println("the number "+num[i] + "is odd");
				}
		}
		System.out.println();
		if(num[0]>num[num.length-1])
		{
			System.out.println("The first number is smaller than last");
		}
		else if(num[0]<num[num.length-1])
		{
			System.out.println("the first number is greater than the last");
		}
		else 
		{
			System.out.println("both first and last numbers are equal");
		}
	
    }
			
}
			