package level2;

import java.util.Scanner;

public class friends {
    public static String young(int[] age) {
        int youngest = age[0];
        String[] names = {"Amar", "Akbar", "Anthony"};
        String name = names[0];
        for (int i = 0; i < age.length; i++) {
            if (age[i] > youngest) {
                youngest = age[i];
                name = names[i];
            }
        }
        return name;
    }

    public static String tall(int[] height) {
        int tall = height[0];
        String[] names = {"Amar", "Akbar", "Anthony"};
        String student = names[0];
        for (int i = 0; i < height.length; i++) {
            if (height[i] > tall) {
                tall = height[i];
                student = names[i];
            }
        }
        return student;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter" + names[i] + "'s age");
            age[i] = input.nextInt();
            System.out.println("Enter" + names[i] + "'s height");
            height[i] = input.nextInt();
        }
        String result1 = young(age);
        String result2 = tall(height);
        System.out.println(result1 + "is the youngest ");
        System.out.println(result2 + "is the tallest ");
    }
}
