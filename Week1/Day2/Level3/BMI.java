import java.util.Scanner;
class BMI{
	public static void main(String[] args){
	 double weight,height,mheight,BMI;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter your weight in kg :");
	 weight = input.nextDouble();
	 System.out.println("Enter your Height in cm :");
	 height = input.nextDouble();
	 mheight = height /100;
	 BMI = weight / (mheight*mheight);
	 if(BMI <=18.4){
		System.out.println("Underweight");
		}
	else if((BMI <=18.5) && (BMI >= 24.9))
	{
		System.out.println("Normal");
	}
	else if ((BMI <= 25.0) && (BMI >= 39.9))
	{
		System.out.println("Overweight");
	}
	else {
		System.out.println("Obese");
	}
	}
}
	 