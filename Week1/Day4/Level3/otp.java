package level3;

import java.util.Arrays;

public class otp {
    public static int get6DigitRandomNumber(){
        int max=999999;
        int min=100000;
        return (int) (Math.random()*(max-min+1))+min;
    }
    public static boolean areotp(int[]otps){
        for(int i=0;i<otps.length;i++){
            for(int j=i+1;j< otps.length;j++){
                if(otps[i]==otps[j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        int[]otpArray = new int[10];
        for(int i=0;i<10;i++){
            otpArray[i] = get6DigitRandomNumber();
        }
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));
        System.out.println("All otps unique: "+areotp(otpArray));
    }

}
