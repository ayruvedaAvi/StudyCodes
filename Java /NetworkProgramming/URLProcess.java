import java.net.*;

public class URLProcess {
    public static void main(String args[])throws MalformedURLException{
        String address="https://www.ledzeppelin.com.np:4000/path/file.html/search?name=JohnBonham#from70s";
        URL url = new URL (address);
        System.out.println("Protocol= "+url.getProtocol());
        System.out.println("Authority= "+(url.getAuthority()));
        System.out.println("Default port= "+(url.getDefaultPort()));
        System.out.println("Host= "+(url.getHost()));
        System.out.println("Path= "+(url.getPath()));
        System.out.println("Query= "+(url.getQuery()));
        System.out.println("File= "+(url.getFile()));
        System.out.println("Refrence= "+(url.getRef()));
        System.out.println("User Info= "+(url.getUserInfo()));
    }

}
