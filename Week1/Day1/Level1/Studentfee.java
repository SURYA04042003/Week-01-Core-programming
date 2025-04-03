import java.util.Scanner;
class Studentfee{
	public static void main(String[] args){
		int fee,discount,totalfee,discountpercent;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the fee:");
		fee = input.nextInt();
		System.out.println("Enter the discountpercent:");
		discountpercent = input.nextInt();
		discount = (fee * discountpercent)/100;
		totalfee = fee - discount;
		System.out.println("The discount amount is INR" + discount + "and final discounted fee is INR "+ totalfee);
		}
	}
		