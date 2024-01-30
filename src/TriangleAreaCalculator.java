import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the length of the triangle
        System.out.print("Enter the length of the triangle: ");
        int length = scanner.nextInt();

        // Step 3: Ask the user for the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Step 5: Compute the area of the triangle
        double area = (length * height) / 2;

        // Step 6: Display the computed area of the triangle
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
