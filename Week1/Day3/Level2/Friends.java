import java.util.Scanner;
class Friends{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int [] age = new int[3];
		int [] height = new int[3];
		String [] names = {"Amar","Akbar","Anthony"};
		int youngest = age[0];
		int taller = height[0];
		for(int i =0;i< 3;i++)
		{
			System.out.println("Enter the  age of " + names[i] +":");
			age [i] =input.nextInt();
			System.out.println("Enter the height of" + names[i] + ":");
			height[i] = input.nextInt();
		}
		String young = names[0];
		String tall = names[0];
		for(int i=0;i<3;i++)
		{
			if(youngest <age[i])
			{
				youngest = age[0];
				young =names[0];
			}
			else 
			{
				youngest = age[i];
				young = names[i];
			}
			if(taller> height[i])
			{
				taller = height[0];
				tall = names[0];
				
			}
			else 
			{
				taller = height[i];
				tall = names[i];
			}
		}
		System.out.println(young + "is youngest");
		System.out.println(tall + "is tallest among all");
	}
}