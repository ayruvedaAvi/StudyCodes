import java.net.*;
class UrlProcess {
	public static void main(String [] args) throws MalformedURLException{
		URL url=new URL("http://xyz.com/path/file/search?name=JimmyPage#fb");
		System.out.println("Protocol: "+url.getProtocol());
		System.out.println("Host: "+url.getHost());
		System.out.println("Port: "+url.getPort());
		System.out.println("DefaultPort: "+url.getDefaultPort());
		System.out.println("Authority: "+url.getAuthority());
		System.out.println("Path: "+url.getPath());
		System.out.println("File: "+url.getFile());
	}
}
