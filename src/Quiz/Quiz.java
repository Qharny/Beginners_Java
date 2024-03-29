package Quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws FileNotFoundException {

        double[] arr = new double[8];
        File quizFile = new File("quiz.txt");
        Scanner input = new Scanner(quizFile);
        PrintWriter output = new PrintWriter("quizDone.txt");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            output.println(arr[i]);
        }

        input.close();
        output.close();
    }
}