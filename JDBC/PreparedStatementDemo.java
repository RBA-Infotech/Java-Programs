package JDBC;

import java.sql.*;
import java.util.Scanner;

/*****************************
 * 
 * Prepared Statement is precompiled SQL Statement it is used to execute
 * parameterized SQL queries
 * 
 **********************************/

public class PreparedStatementDemo {
	public static void main(String[] args) throws SQLException {
		// URL, username, password
		String URL = "jdbc:mysql://localhost:3306/test_db";
		String userName = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(URL, userName, password);

			// Create a PreparedStatement with a parameterized SQL query
			String sql = "SELECT * FROM employees WHERE emp_no =? ";
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			// Set parameter values
			// to fetch based on id
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter emp id for which you want to fetch record from table");
			int emp_no = sc.nextInt();
			// sc.nextLine();
			preparedStatement.setInt(1, emp_no);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				// Process each row in the result set
				System.out.println(resultSet.getInt("emp_no") + "\t | " + resultSet.getString("emp_name") + "\t | "
						+ resultSet.getFloat("salary") + "\t | " + resultSet.getString("ph_no") + "\t | "
						+ resultSet.getString("email_id"));
			}

			// Close the resources
			resultSet.close();
			preparedStatement.close();
			con.close();

		} catch (SQLException s) {
			System.out.println("please check the url or username or password to connect with the My SQL data base");
			s.printStackTrace();
		}
	}
}
