package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagement {

	public static void main(String[] args) {

		Connection con=null;
		
		try {

			// URL, username, password
			String URL = "jdbc:mysql://localhost:3306/tcs_db";
			String userName = "root";
			String password = "root";

			con = DriverManager.getConnection(URL, userName, password);

			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			stmt.executeUpdate("update employee set last_name = 'Boo' where id = 2;");			
			con.commit();
			stmt.executeUpdate("update employee set last_name = 'Sen' where id = 1;");			
			System.out.println("Transaction commited Successfully");
			
        } catch (SQLException e) {
            // Rollback the transaction in case of an error
            try {
				con.rollback();
				System.err.println("Transaction rolled back due to error: " + e.getMessage());
				e.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }

			
	}

}
