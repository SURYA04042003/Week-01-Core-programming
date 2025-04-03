import java.util.Scanner;
class Calculator{
	public static void main(String [] args){
		float num1,num2,add,sub,mul,div;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1 value :");
		num1 = input.nextFloat();
		System.out.println("Enter num2 value :");
		num2 = input.nextFloat();
		add = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		System.out.println("The addition,subtraction,multiplication and division value of 2 numbers " + num1 +"and " +num2+ " is" + add+", " +sub+" ,"+mul+" ,"+ div);
		}
	}