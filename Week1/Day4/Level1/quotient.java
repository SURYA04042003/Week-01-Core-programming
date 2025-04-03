import java.util.Scanner;

public class quotient {
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int Quotient = number/divisor;
        int Remainder = number%divisor;
        int [] digits = new int[2];
        digits[0] =  Quotient;
        digits[1] = Remainder;
        return digits;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        System.out.println("Enter the divisor:");
        int divisor = input.nextInt();
        int [] results=  findRemainderAndQuotient(number,divisor);
        System.out.println("Quotient is :"+ results[0]);
        System.out.println("Remainder is :"+ results[1]);

    }
}
