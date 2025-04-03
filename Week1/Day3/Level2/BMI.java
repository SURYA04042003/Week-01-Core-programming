import java.util.Scanner;
class BMI{
	public static void main(String [] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of person :");
		number = input.nextInt();
		double [] weight = new double[number];
		double [] height = new double[number];
		double [] bmi = new double[number];
		String [] status = new String[number];
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter the person " +(i+1)+ " 's weight: ");
			weight[i] = input.nextDouble();
			System.out.println("Enter the person " +(i+1)+ " 's height in meter: ");
			height[i] = input.nextDouble();
			bmi[i] = weight[i]/height[i];
			if( bmi[i] <= 18.4)
			{
				status[i] = "Underweight";
			}
			else if((bmi[i]<=18.5)&&(bmi[i]>=24.9))
			{
				status[i] = "Normal";
			}
			else if((bmi[i]<= 25.0)&&(bmi[i]>=39.9))
			{
				status[i] = "Overweight";
			}
			else if(bmi[i] >=40.0)
			{
				status[i] = "Obese";
			}
		}
			for(int i=0;i<number;i++)
			{
				System.out.println("Person "+(i+1)+" weights are " + weight[i]+ " heights" +height[i]+" status are " +status[i]+" bmi   "+ bmi[i]);
			} 
	
		
	}
}
		