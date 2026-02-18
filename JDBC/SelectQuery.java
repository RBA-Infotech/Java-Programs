package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// URL, username, password
			String URL = "jdbc:mysql://localhost:3306/test_db";
			String userName = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(URL, userName, password);
			// sys?characterEncoding=latin1

			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from employees");

			ResultSetMetaData metaData = resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();

			// Display table header
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(metaData.getColumnName(i) + "\t |");
			}
			System.out.println();

			while (resultSet.next())
				System.out.println(resultSet.getInt("empno") + "\t | " + resultSet.getString("emp_name") + "\t | "
						+ resultSet.getFloat("salary") + "\t | " + resultSet.getString("ph_no") + "\t | "
						+ resultSet.getString("email_id"));

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
