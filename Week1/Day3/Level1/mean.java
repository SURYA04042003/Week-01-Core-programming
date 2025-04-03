import java.util.Scanner;
class mean{
	public static void main(String [] args){
	double [] heights = new double[11];
	Scanner input = new Scanner(System.in);
	double sum = 0,mean;
	for(int i =0;i<heights.length;i++)
	{
		System.out.println("Enter the height of the player " +(i+1)+" :");
		heights[i] = input.nextDouble();
		sum += heights[i]; 
	}
	mean = sum /11;
	System.out.println("The mean height of the players :" + mean);
	}
}