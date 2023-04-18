import java.sql.*;
import java.util.Scanner;

public class Database {
    public static void main(String [] args) throws ClassNotFoundException,SQLException{
        String url = "jdbc:mysql://localhost:3306/pu";
        String uname = "root";
        String pwd = "exam123";
        Scanner scan = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");  
        Connection cn = DriverManager.getConnection(url, uname, pwd);
        PreparedStatement stmt = cn.prepareStatement("SELECT COUNT(name) from Employee WHERE name = ?");
        System.out.println("Enter a name");
        String name = scan.next();
        stmt.setString(1, name);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        System.out.println("Number of records with the given name = " + count);
        cn.close();
        scan.close();
    }       
}
