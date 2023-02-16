import java.sql.*;
import java.util.Scanner;
class Example2 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String []args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			PreparedStatement st=cn.prepareStatement("INSERT INTO contents VALUES(?,?,?)");
			int count=0; String prompt = null;
			do {
				System.out.println("Enter roll no: ");
				int roll= scan.nextInt();
				System.out.println("Enter name: ");
				String name= scan.next();
				System.out.println("Enter faculty: ");
				String faculty= scan.next();
				st.setInt(1, roll);
				st.setString(2, name);
				st.setString(3, faculty);
				int r=st.executeUpdate();
				count=count+r;
				System.out.println("Press N to exit or any key to continue: ");
				prompt=scan.next();
			}while(!(prompt.toLowerCase().startsWith("n")));
			System.out.println("No. of data added = "+count);
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
