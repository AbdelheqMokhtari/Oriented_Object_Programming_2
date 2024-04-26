public class Main {
    public static void main(String[] args) {
        try{
            int myInt = Integer.parseInt("Hello World!");
        }catch (NumberFormatException nfe){
            System.out.println("The string you entered cannot be converted into an integer.");
        }

        try {
            int[] numbers = {0, 1, 2};
            int result = numbers[2]/numbers[0];
            System.out.println("Result: " + result);
            int index = 3;
            int value = numbers[index];
            System.out.println("Value: " + value); // This line won't execute due to the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds.");
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero.");
        }
    }
}