import java.util.Scanner;
class odd{
	public static void main(String [] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		if(number>0){
			for (int i =1 ;i<=number;i++){
				if(i%2 == 0){
					System.out.println( i + " is even number");
					}
				else{
					System.out.println(i + " is odd number");
					}
				}
			}
		}
	}