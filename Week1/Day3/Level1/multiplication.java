import java.util.Scanner;
class multiplication{
	public static void main(String[] args){
		int [] result = new int[11];
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		num =input.nextInt();
		for(int i = 0;i<result.length;i++)
		{
			if(i==0)
			{
				continue;
			}
			result[i]= num*i;
		}
		for(int i = 1;i<=10;i++)
		{
			System.out.println(num + "*" + i + "= " +result[i]);
			
		}
	}
}