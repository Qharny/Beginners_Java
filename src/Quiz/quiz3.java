package Quiz;

import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args) {
        // user input
        System.out.println("Enter s: ");
        Scanner input = new Scanner(System.in);
        double s = input.nextDouble();
        int Area = (int) ((6 * s)/(4*Math.tan(Math.PI/6)));
        System.out.println(Area);
        input.close();




    }
}
