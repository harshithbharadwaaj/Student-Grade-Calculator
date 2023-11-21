import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of grades");
        int grades = in.nextInt();
        float[] student = new float[grades];

        for (int i = 0; i < grades; i++) {
            System.out.println("Enter the grade " + (i + 1) + ":");
            student[i] = in.nextFloat();
        }

        in.close();

        float total = 0.0f;

        for (int i = 0; i < grades; i++) {
            total += student[i];
        }

        float average = total / grades;

        System.out.println("Average grades is: " + average);
    }
}
