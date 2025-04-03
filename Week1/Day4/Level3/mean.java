package level3;

public class mean {
    public static double sum (double [] students){
        double sum=0;
        for(int i =0;i<students.length;i++){
            sum += students[i];
        }
        return sum;
    }
    public static  double heightmean(double[]students,double sum){
        double meanstudent =0 ;
        for (int i=0;i<students.length;i++){
            meanstudent = sum/ students.length;
        }
        return meanstudent;
    }
    public static double shortest (double[]student){
        double small = student[0];
        for(int i =0;i<student.length;i++){
            if(small>student[i])
            {
                small = student[i];
            }
        }
        return small;
    }
    public static double tallest(double[]student){
        double tall = student[0];
        for(int i=0;i<student.length;i++){
            if(tall<student[i])
            {
                tall = student[i];
            }
        }
        return tall;
    }
    public static void main(String[]args){
        int size = 11;
        int min = 150;
        int max = 250;
        double [] random = new double[size];
        for(int i=0;i<11;i++){
            random[i] = (int)(Math.random()*(max-min+1))+min;
        }
        double addition = sum(random);
        double means = heightmean(random,addition);
        double smaller = shortest(random);
        double taller = tallest(random);
        System.out.println("The shortest player's height :"+ smaller);
        System.out.println("The tallest player's height :"+taller);
        System.out.println("The mean of all player's height :"+ String.format("%.2f",means));

    }
}
