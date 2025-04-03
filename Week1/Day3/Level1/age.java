import java.util.Scanner;
class age{
	public static void main(String[] args){
		int [] age = new int[10];
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the ages :");
		for (int i =0;i <10;i++)
		{
			age[i] = input.nextInt();
		}
		for(int i=0;i<age.length;i++)
		{
			if(age[i]<0)
			{
				System.err.println("Invalid age");
			}
			else if(age[i]>=18)
			{
				System.out.println("The student with the age " +age[i] + "can vote.");
			}
			else{
				System.out.println("The student with the age " + age[i] + "cannot vote.");
				}
		}
	}
}