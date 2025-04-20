// Class to calculate the square root of a number.
public class SquareRoot {
    public static double squareRoot(double a) {
        // Check for negative number input
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}
