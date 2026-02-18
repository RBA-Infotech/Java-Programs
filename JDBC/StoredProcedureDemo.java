package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class StoredProcedureDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		// URL, username, password
		String URL = "jdbc:mysql://localhost:3306/test_db";
		String userName = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(URL, userName, password);

			CallableStatement cStmt = con.prepareCall("{call GetSalary(?, ?)}");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee No: ");
			int empId = sc.nextInt();
			
			cStmt.setInt(1, empId);
			cStmt.registerOutParameter(2, Types.FLOAT);
		
			//boolean hasResults = 
					cStmt.execute();

			float empSalary = cStmt.getFloat("emp_salary");
            System.out.println("| Emp_No | Salary |");
            System.out.printf("| %d | %.2f |\n", empId, empSalary);

			cStmt.close();
		} catch (SQLException s) {
			System.out.println(s.getMessage());
		}
	}
}
