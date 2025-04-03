import java.util.Scanner;
class switchop{
	public static void main(String[] args){
		double first,second;
		String op;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number :");
		first = input.nextDouble();
		System.out.println("Enter the second number :");
		second = input.nextDouble();
		System.out.println("Enter any operator from +,/,*,- :");
		op = input.next();
		double result = 0;
			switch(op){
				case "+":
					result = first+second;
					System.out.println("The sum is " + result);
					break;
				case "-":
					result = first-second;
					System.out.println("The difference is " + result);
					break;
				case "*" :
					result = first*second;
					System.out.println("The product is " + result);
					break;
				case "/" :
					result = first/second;
					System.out.println("The quotient is " + result);
					break;
				default:
					System.out.println("Enter valid operation");
				}
			}
		}
	
		