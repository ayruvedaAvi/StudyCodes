import java.net.*;
import java.io.*;
import java.util.*;

class Request{
	public static void main(String []args)throws IOException{
		URL url=new URL("https://ncit.edu.np/");
		HttpURLConnection cn=(HttpURLConnection)url.openConnection();
		Map<String,List<String>> headers=cn.getHeaderFields();
		for(Map.Entry<String,List<String>>h:headers.entrySet()) {
			System.out.println(h.getKey()+" : "+h.getValue());
			System.out.println("*********");
		}
		
	}
}