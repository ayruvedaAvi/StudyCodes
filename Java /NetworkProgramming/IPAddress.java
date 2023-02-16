import java.net.*;
public class IPAddress {
    public static void main(String [] args) throws UnknownHostException{
        InetAddress[] google=InetAddress.getAllByName("www.google.com");
        //For LocalHost: InetAddress.getLocalHost()
        for(InetAddress add:google){
            System.out.println("Address: "+add.getHostAddress());
            //For name: getHostName()
        }
    }
}
