import java.net.*;
import java.io.*;
public class Response {
	public static void main(String []args)throws IOException{
		URL url=new URL("https://ncit.edu.np/");
		HttpURLConnection cn=(HttpURLConnection)url.openConnection();
		System.out.println("Response COde: "+cn.getResponseCode());
		System.out.println("Response msg: "+cn.getResponseMessage());
		System.out.println("Content encoding: "+cn.getContentEncoding());
		System.out.println("Content Timeout: "+cn.getConnectTimeout());
		System.out.println("Content length: "+cn.getContentLength());
		System.out.println("Content Type: "+cn.getContentType());
		
	}
}