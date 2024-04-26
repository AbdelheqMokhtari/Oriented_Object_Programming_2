import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyApplication {
    public static void main(String[] args) {
        try {
            Calculator stub = (Calculator) Naming.lookup("rmi://localhost:5000/abdelheq");
            int x = 5;
            int y = 8;
            System.out.println(x + " + " + y + " = " + stub.add(x, y));
            System.out.println(x + " * " + y + " = " + stub.multiply(x, y));
            System.out.println(x + " - " + y + " = " + stub.subtract(x, y));
            System.out.println(x + " / " + y + " = " + stub.divide(x, y));
        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            System.err.println(e.getMessage());
        }
    }
}
