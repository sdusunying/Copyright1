package DatabaseTest;

import java.sql.*;

public class DataCon {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Äã»­ÎÒ²Â",
				"root", "sdusunying");
		Statement stmt = conn.createStatement();int numb=2;
		String sql = "select * from drawing where numb= " + "'" + numb + "'";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			String col1 = rs.getString(2);
			//String col2 = rs.getString(2);
			System.out.println(col1);//System.out.println(col2);
		}

	}
}
