package Quiz;

import java.util.Arrays;
public class Quiz8 {
    public static void main(String[] args) {

        int[][] courses = {
                {3, 80},
                {2, 93},
                {1, 75},
                {3, 82}
        };


        int totalCreditHours = 0;
        for (int i = 0; i < courses.length; i++) {
            totalCreditHours += courses[i][0];
        }
        double semesterAverage = 0;
        for (int i = 0; i < courses.length; i++) {
            semesterAverage += courses[i][0] * courses[i][1];
        }
        semesterAverage /= totalCreditHours;
        System.out.println("Total credit hours: " + totalCreditHours);
        System.out.println("Semester average: " + semesterAverage);
    }
}
