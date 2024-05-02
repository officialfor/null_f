import java.rmi.*;
import java.rmi.server.*;

public class Serverimpl extends UnicastRemoteObject implements Serverintf {

    public Serverimpl() throws RemoteException{

    }


    public double Addition(double num1, double num2){
        return num1+num2;
    }

    public double Subtraction(double num1, double num2){
        return num1-num2;
    }

    public double Multiplication(double num1, double num2){
        return num1*num2;
    }

    public double Division(double num1, double num2){
        if(num2==0){
            System.out.println("Not divisible by 0");
        }
        return num1/num2;
    }
    
}
