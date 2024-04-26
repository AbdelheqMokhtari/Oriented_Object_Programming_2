public class MaxInputException extends Exception{
    public MaxInputException(String message) {
        super(message);
    }

    public MaxInputException() {
    }

    @Override
    public String toString() {
        return "Input cant be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "this error occur because you entered a number bigger than 1000000";
    }
}
