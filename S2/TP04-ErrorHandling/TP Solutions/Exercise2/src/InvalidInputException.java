public class InvalidInputException extends Exception{
    public InvalidInputException() {
    }

    public InvalidInputException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "Cannot add 8 and 9";
    }
}
