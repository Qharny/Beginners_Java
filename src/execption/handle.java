package execption;

public class handle {
    public static void main(String[] args) {
        int numerator = 7;
        int denominator = 0;
        try {
            int answer = numerator / denominator;
            System.out.println("Result: " + answer);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.out.println("Cannot divide a value by zero.");
        }
    }
} 
