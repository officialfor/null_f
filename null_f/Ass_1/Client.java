import java.rmi.*;
import java.util.*;

public class Client {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            String url = "rmi://localhost/Server";
            Serverintf serverintf = (Serverintf) Naming.lookup(url);

            System.out.println("Enter first Number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter Second Number: ");
            double num2 = sc.nextDouble();

            System.out.println("First number is "+ num1);
            System.out.println("Second number is "+ num2);

            System.out.println("______________RESULTS________________");
            System.out.println("Addition is: "+serverintf.Addition(num1, num2));
            System.out.println("Subtraction is: "+serverintf.Subtraction(num1, num2));
            System.out.println("Multiplication is: "+serverintf.Multiplication(num1, num2));
            System.out.println("Division is: "+serverintf.Division(num1, num2));





            



            
        } catch (Exception e) {
            System.out.println("Exception at client"+e.getMessage());
        }
        
    }
}
