import java.net.*;
import java.io.*;
public class ServerMT {
	public static void main(String []args) throws IOException{
		ServerSocket listener = new ServerSocket(3500);
		System.out.println("Server running at 3500!");
		while(true){
			Socket socket= listener.accept();
			ClientHandler thread=new ClientHandler(socket);
			thread.start();
		}
	}
}
class ClientHandler extends Thread{
	private Socket socket;
	public ClientHandler(Socket socket) {
		this.socket=socket;
	}
	public void run() {
		try {
			System.out.println("Client connected using port: "+socket.getPort());
			DataInputStream dis=new DataInputStream(this.socket.getInputStream());
			DataOutputStream dos= new DataOutputStream(this.socket.getOutputStream());
			while(true) {
				String text=(String)dis.readUTF();
				String rev ="";
				for(int i=text.length()-1;i>=0;i--) {
					rev=rev+text.charAt(i);
				}
				String reply=rev.equalsIgnoreCase(text)?"Palindrome!":"Not palindrome!";
				dos.writeUTF(reply);
				if(text.equalsIgnoreCase("exit")) {
					break;
				}
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}