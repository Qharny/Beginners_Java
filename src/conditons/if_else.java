package conditons;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        System.out.println("UMaT Grading System. \n");
        // Get user input
        System.out.print("Enter your mark: ");
        Scanner input = new Scanner(System.in);
        int mark = input.nextInt();

        // conditional statement
        if ((mark>= 80.0)&&(mark<=100)) {
            System.out.println("First class");
        }
        else if ((mark>= 70.0)&&(mark<=80.0)) {
            System.out.println("Second class Upper");
        }
        else if ((mark>= 60.0)&&(mark<=70.0)) {
            System.out.println("Second class Lower");
        }
        else if ((mark>= 50.0)&&(mark<=60.0)) {
            System.out.println("Third class");
        }
        else if ((mark> 100.0)&&(mark< 0)) {
            System.out.println("invaid mark");
        }
        else{
            System.out.println("you failed. Due to low mark attain");
        }


        // close scanner
        input.close();
    }
}


// what is finally block in java?

// A finally block in Java is a block of code that is 
// executed a try block and any corresponding catch blocks have finished executing, 
// regardless of whether an exception was thrown or not. is used to ensure that certain actions are always performed, 
// such as cleaning up resources or closing connections, even if an exception occurs. The code in the finally block 
// is guaranteed to be executed, making it a useful place to put important cleanup code.


// 0 divided by 0 in java?