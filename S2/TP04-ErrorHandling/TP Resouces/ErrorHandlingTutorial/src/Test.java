public class Test {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Attempting to divide by zero
            System.out.println("Result: " + result); // This line won't execute due to the exception
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero.");
        }
    }

    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}

