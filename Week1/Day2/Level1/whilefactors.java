import java.util.Scanner;
class whilefactors{
	public static void main(String[] args){
		int number,i=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		number = input.nextInt();
		if(number >0){
			while(i<number){
				if(number%i==0){
					System.out.println(i);
					}
					i++;
				}
			}
		else{
			System.out.println("Enter positive interger");
			}
		}
	}