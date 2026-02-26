package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// URL, username, password
			String URL = "jdbc:mysql://localhost:3306/tcs_db";
			String userName = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(URL, userName, password);

			Statement stmt = con.createStatement();
			System.out.println("Before Update");
			ResultSet resultSet = stmt.executeQuery("select * from employee where id = 1");
			resultSet.next();
			System.out.println(resultSet.getInt(1) + "\t | " + resultSet.getString(2) + "\t | " + resultSet.getString(3)
					+ "\t | " + resultSet.getString(4) + "\t |" + resultSet.getFloat(5));

			System.out.println("After Update");
			stmt.executeUpdate("update employee set last_name = 'Natarajan' where id = 1; ");
			resultSet = stmt.executeQuery("select * from employee where id = 1");
			resultSet.next();
			System.out.println(resultSet.getInt(1) + "\t | " + resultSet.getString(2) + "\t | " + resultSet.getString(3)
					+ "\t | " + resultSet.getString(4) + "\t |" + resultSet.getFloat(5));

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
