import java.util.Scanner;

public class chilltemp {
    public static double calculateWindChill(double temperature,double windSpeed){
        double windChill = 35.74 + 0.6215 * temperature+(0.4275 * temperature - 35.75) * windSpeed;
        return windChill;
    }
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature : ");
        double temperature = input.nextDouble();
        System.out.println("Enter the wind speed : ");
        double windSpeed = input.nextDouble();
        double result = calculateWindChill(temperature,windSpeed);
        System.out.println("The wind chill :" + result);
    }
}
