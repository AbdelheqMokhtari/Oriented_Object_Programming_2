public class Main {
    public static void main(String[] args) throws InvalidInputException,  CannotDivideByZeroException,
            MaxInputException, MaxMultiplyInputException {

        CustomCalculator calculator = new CustomCalculator();
        calculator.add(8,9);
        calculator.divide(6,0);
        calculator.divide(60000000,40);
        calculator.multiply(5,9888);

    }
}
