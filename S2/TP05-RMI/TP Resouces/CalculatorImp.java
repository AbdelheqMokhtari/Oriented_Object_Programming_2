import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLOutput;

public class CalculatorImp extends UnicastRemoteObject implements Calculator {
    protected CalculatorImp() throws RemoteException {
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        System.out.println("the server is adding two numbers ... " + x + " + " + y);
        return x + y;
    }

    @Override
    public int subtract(int x, int y) throws RemoteException {
        System.out.println("the server is subtracting two numbers ... " + x + " - " + y);
        return x - y;
    }

    @Override
    public int multiply(int x, int y) throws RemoteException {
        System.out.println("the server is multiplying two numbers ... " + x + " * " + y);
        return x * y;
    }

    @Override
    public int divide(int x, int y) throws RemoteException {
        System.out.println("the server is dividing two numbers ... " + x + " + " + y);
        return x / y;
    }
}
