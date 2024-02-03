package conditons;

import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        // Create a scanner variable to accept user input

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // conditional statement
        if (number%2==0) {
            System.out.println("THe number is even");
        }
        else{
            System.out.println("The number is odd");
        }


        // close the scanner
        input.close();
    }
}
