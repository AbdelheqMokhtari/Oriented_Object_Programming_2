import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    int add(int x,int y) throws RemoteException;
    int subtract(int x,int y) throws RemoteException;
    int multiply(int x, int y) throws RemoteException;
    int divide(int x, int y) throws RemoteException;

}
