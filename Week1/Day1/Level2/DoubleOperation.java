import java.util.Scanner;
class DoubleOperation{
	public static void main(String [] args){
		double a,b,c,result1,result2,result3,result4;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value :");
		a = input.nextDouble();
		System.out.println("Enter b value :");
		b = input.nextDouble();
		System.out.println("Enter c value :");
		c = input.nextDouble();
		result1 = a+b*c;
		result2 = a*b+c;
		result3 = c+a/b;
		result4 = a%b+c;
		System.out.println("The result of double Operations are "+ result1+ ","+result2+ ","+result3 +","+result4);
		}
	}