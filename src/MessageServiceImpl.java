import java.rmi.*;
import java.rmi.server.*;


public class MessageServiceImpl extends UnicastRemoteObject implements MessageService{
    private String message;
    protected MessageServiceImpl() throws RemoteException{
        super();
        this.message = "Hello this is the server, thats the default message";
    }
    @Override
    public String getMessage() throws RemoteException{
        return message;
    }
    public void setMessage(String mess) throws RemoteException{
        this.message = mess;
    } 
}
