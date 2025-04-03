import java.util.Scanner;
class factors{
	public static void main(String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		number = input.nextInt();
		if(number >0){
			for(int i=1;i<number;i++){
				if(number%i==0){
					System.out.println(i);
					}
				}
			}
		else{
			System.out.println("Enter positive interger");
			}
		}
	}