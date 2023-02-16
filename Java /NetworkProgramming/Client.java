import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
	public static void main(String []args )throws IOException{
		Socket socket=new Socket("localhost",3500);
		DataInputStream dis= new DataInputStream(socket.getInputStream());
		Scanner scan =new Scanner(System.in);
		DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
		String msg;
		String smsg;
		while(true) {
			System.out.println("Enter a word to check, exit to exit: ");
			msg=scan.nextLine();
			if(msg.equalsIgnoreCase("exit")) {
				break;
			}
			dos.writeUTF(msg);
			smsg=dis.readUTF();
			System.out.println("Server says: "+smsg);
		}
		scan.close();
		dos.close();
		dis.close();
		socket.close();
	}
}
