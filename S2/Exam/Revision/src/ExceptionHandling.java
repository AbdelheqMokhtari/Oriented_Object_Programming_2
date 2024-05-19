import jdk.jshell.EvalException;

import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String []args) throws Exception {

        System.out.println("test");

        // try-catch block

        try {
            System.out.println(120/0);
        }catch (ArithmeticException e){
            System.out.println("this is an arithmetic exception !! ");
        }catch (IllegalArgumentException e){
            System.out.println("this is an illegal argument " + e.getMessage());
        }finally {
            System.out.println("this is code will always be executed");
        }

        // finally

        // throw and throws

        int a = 2;

        try {
            validAge(a);
        }catch (RuntimeException e){
            System.out.println("your age is not valid");
        }

    }

    static void validAge(int n) throws Exception,InvalidInputException{

        if(n < 0){
            throw new InvalidInputException();
        }
        if(n > 100){
            throw  new Exception();
        }
        System.out.println("the age is valid");
    }
}
