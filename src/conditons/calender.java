package conditons;

import java.util.Scanner;

public class calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get user input
        System.out.print("Enter your year of birth: ");
        int YOB = input.nextInt();

        if (YOB % 12 == 0) {
            System.out.println("Year of Monkey");
        } else if (YOB % 12 == 1) {
            System.out.println("Year of Rooster");
        } else if (YOB % 12 == 2) {
            System.out.println("Year of Dog");
        } else if (YOB % 12 == 3) {
            System.out.println("Year of Pig");
        } else if (YOB % 12 == 4) {
            System.out.println("Year of Rat");
        } else if (YOB % 12 == 5) {
            System.out.println("Year of Ox");
        } else if (YOB % 12 == 6) {
            System.out.println("Year of Tiger");
        } else if (YOB % 12 == 7) {
            System.out.println("Year of Rabbit");
        } else if (YOB % 12 == 8) {
            System.out.println("Year of Dragon");
        } else if (YOB % 12 == 9) {
            System.out.println("Year of Snake");
        } else if (YOB % 12 == 10) {
            System.out.println("Year of Horse");
        } else {
            System.out.println("Year of the Sheep");
        }

        input.close();
    }
}