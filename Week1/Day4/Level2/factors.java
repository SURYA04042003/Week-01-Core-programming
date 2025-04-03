package level2;

import java.util.Scanner;

public class factors {
    public static int [] factor(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factor = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factor[index] = i;
                index++;
            }
        }

        return factor;
    }
        public static int sum(int[] factor){
            int sum =0;
            for(int i =0;i<factor.length;i++)
            {
                sum += factor[i];
            }
            return sum;
        }
        public static int product(int[] factor){
        int product = 0;
        for(int i=0;i<factor.length;i++)
        {
            product *= factor[i];
        }
        return product;
        }
        public static int square(int[] factor,int sum){
        int squaresum = 0;
        for(int i=0;i< factor.length;i++)
        {
            squaresum += Math.pow(factor[i],2 );
        }
        return squaresum;
        }
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int number = input.nextInt();
            int [] result = factor(number);
            int additon = sum(result);
            int multiplication = product(result);
            int squares =  square(result,additon);
            for(int i=0;i<result.length;i++)
            {
                System.out.println("The factors are :"+result[i]);
            }
            System.out.println("The sum of factor is : "+additon);
            System.out.println("The product of factor is : "+multiplication);
            System.out.println("the sum of square of the factors : "+squares);
        }
}
