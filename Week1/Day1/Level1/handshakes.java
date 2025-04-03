import java.util.Scanner;
class handshakes{
	public static void main(String [] args){
		int n,combination;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		n = input.nextInt();
		combination = (n*(n-1))/2;
		System.out.println("The number of possible handshakes " + combination);
		}
	}