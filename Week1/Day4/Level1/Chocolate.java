import java.util.Scanner;

public class Chocolate {
    public static int[] findRemainderAndQuotient(int chocolate,int students){
        int Distribution = chocolate/students;
        int remaining = chocolate%students;
        int [] result = new int[2];
        result[0] = Distribution;
        result[1] = remaining;
        return result;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of chocolate: ");
        int chocolate = input.nextInt();
        System.out.println("Enter no of children :");
        int students = input.nextInt();
        int [] results = findRemainderAndQuotient(chocolate,students);
        System.out.println("The number of chocolates each child gets : " +results[0]);
        System.out.println("The number of remaining chocolates : "+results[1]);

    }

}
