import java.util.Scanner;

public class positive {
    public static int define(int number){
        int answer = 0;
        if (number>0){
            answer = 1;
        }
        else if (number<0){
             answer= -1;
        }
        else{
             answer =  0;
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int numbers = define(number);
        System.out.println("The number is "+ numbers);
    }
}
