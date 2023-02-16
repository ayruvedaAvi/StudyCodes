import java.sql.*;
import java.util.Scanner;
class Delete {
	static Scanner scan =new Scanner(System.in);
	public static void main(String []args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			PreparedStatement st=cn.prepareStatement("DELETE FROM contents WHERE roll=(?)");
			int count=0; String prompt = null;
			do {
				System.out.println("Enter roll no: ");
				int roll= scan.nextInt();
				st.setInt(1, roll);
				int r=st.executeUpdate();
				count=count+r;
				System.out.println("Press N to exit or any key to continue: ");
				prompt=scan.next();
			}while(!(prompt.toLowerCase().startsWith("n")));
			System.out.println("No. of data deleted = "+count);
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

