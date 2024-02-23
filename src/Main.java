// this one I used Ai.
public class Main {
    public static void main(String[] args) {
        // (a) Maximum value
        double[] set = {-2.1, -1.5, -0.6};
        double max = findMax(set);
        System.out.println("Maximum value for the set (-2.1, -1.5, -0.6): " + max);

        // (b) Minimum value
        double min = findMin(set);
        System.out.println("Minimum value for the set (-2.1, -1.5, -0.6): " + min);

        // (c) Absolute value
        double num1 = -1.51;
        double num2 = 1.51;
        double abs1 = Math.abs(num1);
        double abs2 = Math.abs(num2);
        System.out.println("Absolute value for -1.51: " + abs1);
        System.out.println("Absolute value for 1.51: " + abs2);
    }

    // Method to find maximum value in an array
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find minimum value in an array
    public static double findMin(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}