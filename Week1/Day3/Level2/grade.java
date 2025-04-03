import java.util.Scanner;
class grade{
	public static void main(String []args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		double [] percentages = new double[number];
		String [] grade = new String[number];
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter "+(i+1)+"person's physics mark : ");
			double physics = input.nextDouble();
			if(physics<0)
			{
				System.out.println("enter positive values ");
			}
			System.out.println("Enter "+(i+1)+"person's chemistry mark : ");
			double chemistry = input.nextDouble();
			if(chemistry<0)
			{
				System.out.println("enter positive values ");
			}
			System.out.println("Enter "+(i+1)+"person's maths mark : ");
			double maths = input.nextDouble();
			if(maths<0)
			{
				System.out.println("enter positive values ");
			}
			percentages[i] = (physics+chemistry+maths)/3;
			if(percentages[i]>=80)
			{
				grade[i] = "A";
				System.out.println(grade[i]);
			}
			else if((percentages[i]>=70)&&(percentages[i]<=79))				
			{
				grade[i] = "B";
				System.out.println(grade[i]);
			}
			else if((percentages[i]>=60)&&(percentages[i]<=69))				
			{
				grade[i] = "C";
				System.out.println(grade[i]);
			}	
			else if((percentages[i]>=50)&&(percentages[i]<=59))				
			{
				grade[i] = "D";
				System.out.println(grade[i]);
			}	
			else if((percentages[i]>=40)&&(percentages[i]<=49))				
			{
				grade[i] = "E";
				System.out.println(grade[i]);
			}	
			else if(percentages[i]<=39)				
			{
				grade[i] = "R";
				System.out.println(grade[i]);
			}
		}
			
		for(int i=0;i<number;i++){
			System.out.println("person" + (i+1) +"details");
			System.out.println("percentages :" + percentages[i]);
			System.out.println("Grade : " + grade[i]);
		}
	}
}