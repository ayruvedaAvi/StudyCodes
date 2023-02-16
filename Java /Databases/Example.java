import java.sql.*;
class Example{
	public static void main(String []args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			DatabaseMetaData meta= cn.getMetaData();
			System.out.println("Username = "+ meta.getUserName());
			System.out.println("Driver = "+ meta.getDriverName());
			System.out.println("Driver version = "+ meta.getDriverVersion());
			System.out.println("Database product = "+ meta.getDatabaseProductName());
			System.out.println("Database product version = "+ meta.getDatabaseProductVersion());
			cn.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}