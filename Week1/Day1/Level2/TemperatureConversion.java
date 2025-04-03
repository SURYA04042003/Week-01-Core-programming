import java.util.Scanner;
class TemperatureConversion{
	public static void main(String[] args){
		double farenheit,celsiusResult;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the farenheit value :");
		farenheit = input.nextDouble();
		celsiusResult =(farenheit-32)*5/9;
		System.out.println("The " + farenheit + "farenheit is " + celsiusResult + "celsius");
		}
	}
		