import java.util.Scanner;

public class findsmall {
    public static int[] findSmallestAndLargest(int number1,int number2,int number3){
        int small = Math.min(Math.min(number1,number2),number3);
        int large = Math.max(Math.max(number1,number2),number3);
        int [] result = new int[2];
        result[0] = small;
        result[1] = large;
        return result;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = input.nextInt();
        System.out.println("Enter number 2:");
        int number2 = input.nextInt();
        System.out.println("Enter number 3:");
        int number3 = input.nextInt();
        int []results=findSmallestAndLargest(number1,number2,number3);
        System.out.println("Smallest: "+ results[0]);
        System.out.println("Largest : "+results[1]);
    }
}
