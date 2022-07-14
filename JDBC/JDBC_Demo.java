package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {  

			// To retrieve data from MySQL
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?characterEncoding=latin1",
					"root", "root"); //sys?characterEncoding=latin1
			//(URL, username, passwoed)
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");


			while (rs.next())
				System.out.println(rs.getInt(1) + "\t | " + rs.getString(2) + "\t | " + rs.getFloat(3) + "\t | "
						+ rs.getString(4) + "\t | " + rs.getString(5));

			con.close();

		} catch (ClassNotFoundException c) {
			c.printStackTrace();
			System.out.println("The class name you mentioed is not correct");
		} catch (SQLException s) {
			System.out.println("please chec the url or username or password to connect with the My SQL data base");
			s.printStackTrace();
		}
		
		
		/****************************************************
		 * To retrieve data from Oracle
		 *
		 * Class.forName("oracle.jdbc.driver.OracleDriver"); 
		 * Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		 * PreparedStatement ps=con.prepareStatement("select * from filetable");
		 * ResultSet rs=ps.executeQuery();
		 * 
		 *****************************************************/

	}

}
