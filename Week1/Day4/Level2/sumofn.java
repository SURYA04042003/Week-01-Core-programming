package level2;

import java.util.Scanner;

public class sumofn {
    public static int recursion(int num)
    {
        if(num == 1)
        {
            return 1;
        }
        else{
            return num +recursion(num -1);
        }
    }
    public static int formula(int num) {
        int result = num * (num + 1) / 2;
        return result;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        if (num < 0)
        {
            System.out.println("Invalid number");
            return;
        }
        else{
            int results = recursion(num);
            int formularesult = formula(num);
            if(results==formularesult){
                System.out.println("both result are same" + formularesult);
            }
            else{
                System.out.println("both result are not same" + formularesult);
            }
        }
    }
}
