import java.rmi.*;

public class Server {

    public static void main(String[] args) {

        try {

            Serverimpl simp = new Serverimpl();
            Naming.rebind("Server", simp);

            System.out.println("Server Started....");
            
        } catch (Exception e) {
            System.out.println("exception at server"+e.getMessage());;
        }
        
    }
}