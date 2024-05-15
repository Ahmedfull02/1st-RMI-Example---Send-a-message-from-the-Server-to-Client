import java.rmi.*;

public interface MessageService extends Remote{
    String getMessage() throws RemoteException;
    void setMessage (String message) throws Exception;
}
