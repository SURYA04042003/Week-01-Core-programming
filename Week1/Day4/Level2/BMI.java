package level2;

import java.util.Scanner;

public class BMI {
    public static void checkbmi(double [][] students){
        for(int i=0;i<students.length;i++){
            double weight = students[i][0];
            double height = students[i][1];
            double cmtom = height/100;
            double heightsq = Math.pow(cmtom,2);
            double bmi = weight/heightsq;
            students[i][2] = bmi;

        }
    }
    public static String [] status(double[][]students) {
        String[] statusbmi = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            double bmi = students[i][2];
            if (bmi <= 18.4) {
                statusbmi[i]= "Underweight";
            } else if ((bmi >= 18.5) && (bmi <= 24.9)) {
                statusbmi[i]=  "Normal";
            } else if ((bmi >= 25.0) && (bmi <= 39.9)) {
                statusbmi[i]= "Overweight";
            } else {
                statusbmi[i] = "Obese";
            }
        }
        return statusbmi;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double[][]students = new double[10][3];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter"+(i+1)+"weight");
            students[i][0] = input.nextDouble();
            System.out.println("Enter"+(i+1)+"height");
            students[i][1] = input.nextDouble();
            checkbmi(students);
            String [] stustatus = status(students);
            System.out.print("height : "+students[i][1]+", Weight :" + students[i][0]+", BMI : "+ String.format("%.2f",students[i][2])+", status :"+stustatus[i]);

        }
    }

}
