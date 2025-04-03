import java.util.Scanner;
class Temperature{
	public static void main(String[] args){
		double celsius,farenheitResult;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the celsius value :");
		celsius = input.nextDouble();
		farenheitResult = (celsius*9/5) + 32;
		System.out.println("The " + celsius + "celsius is " + farenheitResult + "farenheit");
		}
	}
		