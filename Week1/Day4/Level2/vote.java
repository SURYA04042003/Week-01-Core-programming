package level2;

import java.util.Scanner;

public class vote {
    public static boolean canstudentvote(int age){
        boolean ischecker = false;
        if(age >=18)
        {
            ischecker = true;
        }
        else {
            ischecker = false;
        }
        return ischecker;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int []age = new int[10];
        for(int i =0;i<age.length;i++)
        {
            System.out.println("Enter student"+(i+1) + "'s age:");
            age[i] = input.nextInt();

        if (canstudentvote(age[i]))
        {
            System.out.println("student can vote");
        }
        else{
            System.out.println("Student cannot vote");
        }
        }
    }

}
