import java.util.Scanner;
class Zara{
	public static void main(String[] args){
		double [] salary = new double[10];
		double [] service = new double[10];
		double [] newsalary = new double[10];
		double [] bonus = new double[10];
		double totalbonus =0,amount=0 ;
		double totaloldsalary=0,year=0;
		double newSal=0;
		Scanner input = new Scanner(System.in);
		for(int i =0;i<10;i++)
		{
			System.out.println("Enter your salary: ");
			amount = input.nextDouble();
			System.out.println("Enter your year of service :");
			year = input.nextDouble();
			if((amount<=0)||(year<=0))
			{
				System.err.println("Invalid input");
				break;
			}
		
				salary[i] = amount;
				service[i] = year;
				if(year>5)
				{
					bonus[i] = amount*0.02;
				}
				else{
					bonus[i] = amount*0.05;
				}
				
			newsalary[i] = salary[i]+bonus[i];
			totalbonus += bonus[i];
			totaloldsalary +=salary[i];
			newSal += newsalary[i];
		}
			System.out.println("the totalbonus is :" + totalbonus);
			System.out.println("the total new salary is :" + newSal);
			System.out.println("the total old salary is :" + totaloldsalary);
	}
}