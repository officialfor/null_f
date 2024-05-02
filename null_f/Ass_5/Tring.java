import java.util.*;

import javax.sound.midi.Receiver;

public class Tring {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The number of nodes you want:");
        int n = sc.nextInt();

        System.out.println("Ring formed is : ");

        for(int i=0;i<n;i++){
            System.out.print(i+ " ");

        }
        System.out.println("0");


        int ch=0;
        int token=0;

        do{
            System.out.println("Enter Sender: ");
            int sender =sc.nextInt();

            System.out.println("Enter Receiver: ");
            int receiver = sc.nextInt();

            System.out.println("Enter Data: ");
            int data = sc.nextInt();

            System.out.println("Token Passing");

            for(int i=token;i!=sender;i=(i+1)%n){

                System.out.print(+i +" -> ");

            }
            System.out.println(sender);
            System.out.println("Sender "+ sender +" Sending the data : " +data);

            for(int i=sender;i!=receiver;i=(i+1)%n){
                System.out.println("Data : "+ data +" Forwaded by "+i);
            }

            System.out.println("Receiver "+receiver+ " received the Data : "+data);
            token =sender;

            System.out.println("Do You Want to Continue ? ;  1 == YES,  0 == NO");
            ch = sc.nextInt();
            
        }while (ch==1);
        

        



















    }
}