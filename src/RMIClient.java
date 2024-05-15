import java.rmi.*;

public class RMIClient {
    public static void main(String[] args) throws Exception {
        try{
            MessageService messageService = (MessageService) Naming.lookup("//localhost/MessageService");
            String message = messageService.getMessage();
            System.out.println("Message from server ; " + message);
        }
        catch (java.rmi.ConnectException e){
            System.err.println("SERVER NOT WORKING.");
        }
        catch (Exception e){
            System.err.println("Other Exception.");
        }
    }
}
