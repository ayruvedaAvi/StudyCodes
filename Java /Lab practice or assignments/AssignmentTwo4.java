import java.sql.*;

public class AssignmentTwo4 {
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase","root","");
        Statement st= cn.createStatement();
        String query="CREATE TABLE student (roll INT, name VARCHAR(50), faculty VARCHAR(10)";
        st.executeQuery(query);
        cn.close();
    }
}
