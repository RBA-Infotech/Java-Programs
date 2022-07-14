package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

//import com.mysql.jdbc.CallableStatement;
import java.sql.ResultSet;



public class StoredProcedureDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?characterEncoding=latin1", "root", "root");
		CallableStatement cStmt = con.prepareCall("{call BankDetails(?,?,?)}");
		
		//cStmt.registerOutParameter(1, Types.VARCHAR);
		
		cStmt.setString(1, "Senthil");
		cStmt.registerOutParameter(2, Types.VARCHAR);
		cStmt.registerOutParameter(3, Types.INTEGER);
		
		boolean hadResults = cStmt.execute();
		
		System.out.println("| BankName | AccNo |");
		
		while(hadResults) {
		ResultSet rs = cStmt.getResultSet();
			while(rs.next()) {
				String BankName = rs.getString(1);
				int AccNo = rs.getInt(2);
				
				System.out.println("| " +BankName+" | " + AccNo +"|");
			}
			hadResults = cStmt.getMoreResults();
		}
				
		cStmt.close();
			
		}
	}


