import java.net.*;
import java.io.*;

public class Server {
  public static void main(String [] args ) throws IOException{
        ServerSocket ss = new ServerSocket(5500);
        System.out.println("Server runnin on 5000");
        while(true){
            Socket s = ss.accept();
            System.out.println("Clinet connected");
            ClientHandler thread = new ClientHandler(s);
            thread.start();
        }
  }  
}


class ClientHandler extends Thread {
    Socket s;
    public ClientHandler(Socket s){
        this.s = s;
    }
    public void run(){
        try{
            DataInputStream dis = new DataInputStream(this.s.getInputStream());
            DataOutputStream dos = new DataOutputStream(this.s.getOutputStream());
            while(true){
                String clientMsg = dis.readUTF();
                System.out.println("Client says: " + clientMsg);
                dos.writeUTF("hELLO Client");
            }

        }catch(IOException e){
        }

    }
}
