public class CannotDivideByZeroException extends Exception{
    public CannotDivideByZeroException() {

    }

    public CannotDivideByZeroException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Can't divide by zero";
    }

    @Override
    public String getMessage() {
        return "these exception occurs because you tried to divide by zero";
    }
}
