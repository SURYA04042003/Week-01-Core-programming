import java.util.Scanner;
class frequency{
	public static void main(String[] args){
		int number;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		number =input.nextInt();
		int []freq =new int[10];
		while(number>0)
		{
			int temp = number%10;
			freq[temp]++;
			number=number/10;
		}
		System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " times");
            }
        }
	}
}

