import java.util.Scanner;
class DBMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter the number :");
		number = input.nextInt();
		double [][] personData = new double[number][3];
		String[] weightStatus = new String [number];
		for (int i =0;i<number;i++)
		{
			System.out.println("Enter person "+ (i+1)+" 's height :");
			double height = input.nextDouble();
			if(height<=0)
			{
				System.out.println("Invalid height");
			}
			System.out.println("Enter person "+ (i+1)+" 's weight :");
			double weight = input.nextDouble();
			if(weight<=0)
			{
				System.out.println("Invalid weight");
			}
			personData[i][0] = height;
            personData[i][1] = weight;
			double bmi = weight/(height*height);
			personData[i][2]=bmi;
			if( bmi <= 18.4)
			{
				weightStatus[i] = "Underweight";
			}
			else if((bmi<=18.5)&&(bmi>=24.9))
			{
				weightStatus[i] = "Normal";
			}
			else if((bmi<= 25.0)&&(bmi>=39.9))
			{
				weightStatus[i] = "Overweight";
			}
			else if(bmi >=40.0)
			{
				weightStatus[i] = "Obese";
			}
		}
		for(int i=0;i<number;i++)
		{
			System.out.println("Person "+(i+1)+" weights are " + personData[i][0]+ " heights" +personData[i][1]+" status are " +weightStatus[i]+" bmi   "+ personData[i][2]);
		} 
	}
}

	