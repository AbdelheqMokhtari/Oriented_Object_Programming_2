public class MaxMultiplyInputException extends Exception{
    public MaxMultiplyInputException(String message) {
        super(message);
    }

    public MaxMultiplyInputException() {

    }

    @Override
    public String toString() {
        return "Input cant be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage() {
        return "Max value for multiply is 7000";
    }
}
