package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// URL, username, password
			String URL = "jdbc:mysql://localhost:3306/test_db";
			String userName = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(URL, userName, password);
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into employee (id, first_name, last_name, email, salary)" + "value(1, 'Poornima', 'S', 'Poornima@gmail.com', 69342.31);");

			System.out.println("One Record Updated successfully");

			con.close();

		} catch (SQLException s) {
			System.out.println("please check the url or username or password to connect with the My SQL data base");
			s.printStackTrace();
		}

	}
}

/****************************************************
 * To retrieve data from Oracle
 *
 * Class.forName("oracle.jdbc.driver.OracleDriver"); Connection
 * con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
 * PreparedStatement ps=con.prepareStatement("select * from filetable");
 * ResultSet rs=ps.executeQuery();
 * 
 *****************************************************/
