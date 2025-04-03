import java.util.Scanner;
class youngest{
	public static void main(String [] args){
		int age1,age2,age3,height1,height2,height3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age of amar :");
		age1 = input.nextInt();
		System.out.println("Enter the age of akbar : ");
		age2 = input.nextInt();
		System.out.println("Enter the age of anthony : ");
		age3 = input.nextInt();
		System.out.println("Enter the height of amar :");
		height1 = input.nextInt();
		System.out.println("Enter the height of akbar :");
		height2 = input.nextInt();
		System.out.println("Enter the height of anthony :");
		height3 = input.nextInt();
		if(age1 < age2 && age1 < age3){
			System.out.println("amar is youngest friend");
			}
		else if(age1 > age2 && age2 < age3){
			System.out.println("akbar is youngest friend");
			}
		else{
			System.out.println("anthony is youngest friend");
			}
		if (height1>height2 && height1 > height3){
			System.out.println("Amar is tallest");
			}
			else if(height1<height2 && height2>height3)
			{
				System.out.println("Akbar is tallest");
			}
			else{
				System.out.println("anthony is tallest");
			}
		}
	}