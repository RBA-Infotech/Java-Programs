package JDBC;

import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriteCLOB {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/test_db";
		String userName = "root";
		String password = "root";

		String insertSql = "INSERT INTO CLOBfiles (id, file_name, file_data) VALUES (?, ?, ?)";

		try (Connection conn = DriverManager.getConnection(URL, userName, password);
				PreparedStatement ps = conn.prepareStatement(insertSql)) {

			conn.setAutoCommit(false); // optional: control transaction
			
			// 2) Write from a file
			String fileName = "src\\JDBC\\CLOBInput.txt";
			try (Reader fileReader = new FileReader(fileName)) {
				ps.setInt(1, 3);
				ps.setString(2, "CLOBInput.txt");
				// If you can get file length, pass it; otherwise use setClob(index, Reader) if
				// supported
				ps.setClob(3, fileReader); // many drivers support this
				ps.executeUpdate();
			}

			conn.commit();
			System.out.println("Inserted clobs successfully.");
		} catch (SQLException | java.io.IOException e) {
			e.printStackTrace();
		}
	}
}
