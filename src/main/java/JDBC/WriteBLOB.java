package JDBC;

import java.io.*;
import java.sql.*;

public class WriteBLOB {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test_db";
		String user = "root";
		String password = "root";

		String insertSQL = "INSERT INTO BLOBfiles (file_name, file_data) VALUES (?, ?)";
		String fileName = "src\\JDBC\\BLOBInput.jpg";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

			// File to be stored in database
			File file = new File(fileName); // replace with your file path
			FileInputStream fis = new FileInputStream(file);

			// Set parameters
			pstmt.setString(1, file.getName());
			pstmt.setBinaryStream(2, fis, (int) file.length());

			// Execute insert
			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println("File stored successfully in database!");
			}

			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
