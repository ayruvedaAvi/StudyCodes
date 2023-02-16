// A program to get html from a website.
import java.net.*;
import java.io.*;
public class HtmlRW {
	public static void main(String []args)throws IOException{
		URL url=new URL("https://ncit.edu.np/");
		HttpURLConnection cn=(HttpURLConnection)url.openConnection();
		InputStream ins=cn.getInputStream();
		FileOutputStream fos= new FileOutputStream("index.html");
		int content;
		while((content=ins.read())!=-1) {
			System.out.print((char)content);
			fos.write(content);
		}
		fos.close();
		ins.close();
	}
}
