import java.net.*;
import java.io.*;
class UDPServer{
    public static void main(String[] args) throws IOException{
        DatagramSocket Server = new DatagramSocket(5000);
        while(true){
            byte[] rxBuffer = new byte[1024];
            DatagramPacket rxPacket = new DatagramPacket(rxBuffer, rxBuffer.length);
            Server.receive(rxPacket);
            String msg = new String(rxPacket.getData());
            System.out.println("Client msg :" + msg);
            InetAddress clientadd = rxPacket.getAddress();
            int clientport = rxPacket.getPort();
            System.out.println("Recived Packet from : " + clientadd + ": " + clientport);
            byte[] SnBuffer = null;
            SnBuffer = msg.getBytes();
            DatagramPacket snPacket = new DatagramPacket(SnBuffer, SnBuffer.length, clientadd, clientport);
            Server.send(snPacket);
        }
    }
}