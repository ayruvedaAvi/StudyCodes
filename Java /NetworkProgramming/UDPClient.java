import java.net.*;
import java.util.Scanner;
import java.io.*;
class UDPClient{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        DatagramSocket client = new DatagramSocket();
        InetAddress add = InetAddress.getLocalHost();
        while(true){
            System.out.println("Enter a string");
            String text = scan.nextLine();
            if("Exit".equalsIgnoreCase(text)){
                break;
            }
            byte[] SendBuffer = null;
            SendBuffer = text.getBytes();
            DatagramPacket dp = new DatagramPacket(SendBuffer, SendBuffer.length, add, 5000);
            client.send(dp);
            byte[] rxBuffer = new byte[1024];
            DatagramPacket rxPacket = new DatagramPacket(rxBuffer, rxBuffer.length);
            client.receive(rxPacket);
            String reply = new String(rxPacket.getData());
            System.out.println("Server says " + reply);
        }   
        client.close();
        scan.close();
    }
}