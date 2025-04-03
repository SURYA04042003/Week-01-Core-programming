import java.util.Scanner;
class Square{
	public static void main(String [] args){
		float perimeter,a;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter perimeter :");
		perimeter = input.nextFloat();
		a = perimeter/4;
		System.out.println("The length of the side is "+ a + "whose perimeter is " + perimeter);
}
}

		