import java.util.Scanner;

public class  handshake {
    public static int combination(int number) {
        int combine = (number * (number - 1)) / 2;
        return combine;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int handscombine = handshake.combination(number);
        System.out.println("The number of possible handshakes are " + handscombine);
    }
}

