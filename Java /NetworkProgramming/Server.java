import java.net.*;
import java.io.*;
public class Server {
	public static void main(String []args) throws IOException{
		ServerSocket listener = new ServerSocket(3500);
		System.out.println("Server running at 3500!");
		Socket s= listener.accept();
		System.out.println("Client connected using port: "+s.getPort());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos= new DataOutputStream(s.getOutputStream());
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
		dos.close();
		dis.close();
		s.close();
		listener.close();
	}
}
