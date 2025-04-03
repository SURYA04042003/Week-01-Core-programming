import java.util.Scanner;
class weight{
	public static void main(String[]args){
		double weight,pound;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ur weight : ");
		weight = input.nextDouble();
		pound = weight/2.2;
		System.out.println("The weight of the person in pound is " + String.format("%.2",pound) + " and in kg is " + weight);
		}
		}