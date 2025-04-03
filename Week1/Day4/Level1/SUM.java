import java.util.Scanner;

public class SUM {
    public static int total(int number){
        int sum = 0;
       for (int i = 0 ;i<=number;i++){
           sum += i;
       }
       return sum;
    }
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        int result = total(number);
        System.out.println("The total sum is :"+result);
    }
}
