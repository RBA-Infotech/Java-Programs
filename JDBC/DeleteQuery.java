package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// URL, username, password
			String URL = "jdbc:mysql://localhost:3306/tcs_db";
			String userName = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(URL, userName, password);
			Statement stmt = con.createStatement();
			
			System.out.println("Before Delete");
			ResultSet resultSet = stmt.executeQuery("select * from employee");
			while (resultSet.next())
				System.out.println(resultSet.getInt(1) + "\t | " + resultSet.getString(2) + "\t | "
						+ resultSet.getString(3) + "\t | " + resultSet.getString(4) + "\t |" + resultSet.getFloat(5));

			System.out.println("Enter the Employee ID to delete");
			Scanner sc = new Scanner(System.in);
			int empId = sc.nextInt();
			stmt.executeUpdate("delete from employee where id = " +empId);

			System.out.println("\nAfter Delete");
			resultSet = stmt.executeQuery("select * from employee");
			while (resultSet.next())
				System.out.println(resultSet.getInt(1) + "\t | " + resultSet.getString(2) + "\t | "
						+ resultSet.getString(3) + "\t | " + resultSet.getString(4) + "\t |" + resultSet.getFloat(5));

			con.close();
			//sc.close();

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
