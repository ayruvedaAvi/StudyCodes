import java.net.*;
import java.util.*;
public class AllPortDetails {
	public static void main(String []args)throws SocketException{
		Enumeration<NetworkInterface> ints=NetworkInterface.getNetworkInterfaces();
		for(NetworkInterface nets: Collections.list(ints)) {
			System.out.println("Display name: "+nets.getDisplayName());
			System.out.println("Name: "+nets.getName());
			Enumeration<InetAddress>inet=nets.getInetAddresses();
			for(InetAddress ip:Collections.list(inet)) {
				System.out.println("Address= "+ip.getHostAddress());
			}
			System.out.println("***********");
		}
	}
}
