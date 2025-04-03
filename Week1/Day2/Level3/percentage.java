import java.util.Scanner;
class percentage{
	public static void main(String[] args){
		int physics,maths,chemistry;
		double average;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the physics marks :");
		physics = input.nextInt();
		System.out.println("Enter the chemistry marks :");
		chemistry = input.nextInt();
		System.out.println("Enter the maths marks :");
		maths = input.nextInt();
		average = (physics+maths+chemistry)/3.0;
		int percentage = average*100
		if(percentage >= 80 ){
			System.out.println("Your average mark :"+ average +" and your grade is  A and  Remark is Level 4,above agency-normalized standards");
			}
		else if(percentage>=70 )
		{
			System.out.println("Your average mark :"+ average +" and your grade is  B and  Remark is Level 3,at agency-normalized standards");
		}
		else if(percentage >=60)
		{
			System.out.println("Your average mark :"+ average +" and your grade is  C and  Remark is Level 2,below,but approaching agency-normalized standards");
		}
		else if(percentage >=50)
		{
			System.out.println("Your average mark :" + average + " and your grade is  D and  Remark is Level 1,well below agency-normalized standards");
		}
		else if(percentage >=40)
		{
			System.out.println("Your average mark :"+ average +" and your grade is  E and  Remark is Level ,too below agency-normalized standards");
		}
		else{
			System.out.println("Your average mark :" + average +" and your grade is  R and  Remark is Remedial  standards");
			}
	}
}