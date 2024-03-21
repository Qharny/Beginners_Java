package math;
import java.lang.Math;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        // Convert 30 degrees to radians
        double angleInDegrees = 30;
        double angleInRadians = Math.toRadians(angleInDegrees);

        // Calculate sin, cos, and tan
        double sinValue = Math.sin(Math.toRadians( angleInRadians)); // in radian
        double cosValue = Math.cos(angleInRadians); // in degrees
        double tanValue = Math.tan(angleInRadians);

        // Display the results
        System.out.println("For an angle of " + angleInDegrees + " degrees:");
        System.out.println("Sin: " + sinValue);
        System.out.println("Cos: " + cosValue);
        System.out.println("Tan: " + tanValue);

        // MUST: asin, acos, atan, log1p

    }
}
