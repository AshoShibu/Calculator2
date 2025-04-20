// Class to perform division operation.
public class Division {
    public static double divide(double dividend, double divisor) {
        // Check for division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}
