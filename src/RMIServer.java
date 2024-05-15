import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;

public class RMIServer {
    public static void main (String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        try{
            LocateRegistry.createRegistry(1099);
            MessageService messageService = new MessageServiceImpl();
            Naming.rebind("MessageService", messageService);
            System.out.println("Enter the message to be shared:");
            String userMessage = scanner.nextLine();
            System.out.println("The server is working ...");
            
            messageService.setMessage(userMessage);
            
        }
        catch (java.rmi.RemoteException e){
            System.err.println("error : Server can not run !");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
