package level3;

import java.util.Scanner;

public class numberchecker3 {
    public static boolean getprimenumber(int num)
    {
        if(num<=1)return false;
        for(int i=2;i<num;i++){
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean neon(int num)
    {
        int s=0;
        int ss = (int)Math.pow(num,2);
        while (ss>0){
            s += ss%10;
            ss/=10;
        }
        return s==num;
    }
    public static boolean spy(int num)
    {
        int sum=0;
        int product=1;
        while (num>0){
            sum+=num%10;
            product *= num%10;
            num = num/10;
        }
        return sum==product;
    }
    public static boolean automorphic(int num)
    {
        int s=(int)Math.pow(num,2);
        int count =0;
        int temp =num;
        while (temp> 0) {
            temp=temp/10;
            count++;
        }
        int digit = s% (int)Math.pow(10,count);
        return digit==num;
    }
    public static  boolean buzz(int num)
    {
        if((num%7==0)||(num%10==7)) {
            return true;
        }
        return false;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        System.out.println("The given number is prime : "+ getprimenumber(num));
        System.out.println("The given number is neon number : "+ neon(num));
        System.out.println("The given number is spy number : "+ spy(num));
        System.out.println("The given number is automorphic number : "+ automorphic(num));
        System.out.println("The given number is Buzz number : "+ buzz(num));

    }

}
