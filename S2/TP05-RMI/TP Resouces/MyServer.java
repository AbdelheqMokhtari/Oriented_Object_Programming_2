import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyServer {
    public static void main(String[] args) {
        try {

            Calculator stub = new CalculatorImp();
            Naming.rebind("rmi://localhost:5000/abdelheq",stub);
            System.out.println("The server is ready");

        } catch (RemoteException | MalformedURLException e) {
            System.err.println(e.getMessage());
        }
    }
}
