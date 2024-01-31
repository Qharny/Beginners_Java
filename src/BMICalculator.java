
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your weight in kilograms: ");
            double weight = scanner.nextDouble();

            System.out.println("Enter your height in meters: ");
            double height = scanner.nextDouble();

            double bmi = weight / Math.pow(height, 2);

            System.out.printf("Your BMI is: %.2f\n", bmi);

            if (bmi < 18.5) {
                System.out.println("You are underweight.");
            } else if (bmi < 25.0) {
                System.out.println("You are normal.");
            } else if (bmi < 30.0) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");
            }

            scanner.close();
        }
    }

