import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

public class DanielsSqlTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // Loads jdbc driver class
		
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3307/tblbooks","root",""); // May need to be 3306, etc.

		PreparedStatement statement=con.prepareStatement(
				"Select * from tblbooks");
		
		ResultSet result=statement.executeQuery();
		
		while (result.next()) {
			System.out.println(result.getString(1)+"\t"+result.getString(3));
		}
	}

}
