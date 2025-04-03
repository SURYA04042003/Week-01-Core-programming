package level3;

import java.util.Scanner;

public class numberchecker4 {
    public static int[]factor(int num){
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        int []fact = new int[count];
        int index=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                fact[index]= i;
                index++;
            }
        }
        return  fact;
    }
    public static int greaterfactor(int [] fact)
    {
        return fact[fact.length-1];
    }
    public static int sum(int [] fact){
        int sum=0;
        for(int i=0;i<fact.length;i++)
        {
            sum+= fact[i];
        }
        return sum;
    }
    public static int product(int []fact){
        int products = 1;
        for(int i=0;i<fact.length;i++){
            products *= fact[i];
        }
        return products;
    }
    public static int cube(int []fact){
        int cubeproduct=1;
        for (int i=0;i<fact.length;i++){
            cubeproduct *= (int)Math.pow(fact[i],3);
        }
        return cubeproduct;
    }
    public static boolean perfect(int num){
        int []factor = factor(num);
        int add = sum(factor);
        return add==num;
    }
    public static boolean abundant(int num){
        int [] factor = factor(num);
        int add = sum(factor);
        return  add>num;
    }
    public static boolean deficient(int num){
        int [] factor = factor(num);
        int add = sum(factor);
        return  add<num;
    }
    public static boolean strong(int num){
        int [] factor = factor(num);
        int add = sum(factor);
        return  add==num;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        int[]fac = factor(num);
        System.out.println("The factor array is : ");
        for(int i=0;i<fac.length;i++){
            System.out.print(fac[i] +" ,");
        }
        System.out.println();
        System.out.println("The greater factor in the array is: "+greaterfactor(fac));
        System.out.println("The sum of factor in the array is : "+sum(fac));
        System.out.println("The product of  factor : "+product(fac));
        System.out.println("The product of cube product : "+cube(fac));
        System.out.println("The given number is a perfect number : "+perfect(num));
        System.out.println("The given number is a abundant number : "+abundant(num));
        System.out.println("The given number is  a deficient number : "+deficient(num));
        System.out.println("The given number is  a strong number: "+strong(num));

    }


}
