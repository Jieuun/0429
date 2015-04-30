import java.sql.*;

public class HRempList {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(dburl, "hr", "hr");

		stmt = conn.createStatement();

		String sql = "select first_name, last_name from EMPLOYEES";

		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			String fname = rs.getString(1);
			String lname = rs.getString(2);
			System.out.println(fname + " " + lname);

		}

		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}

	}

}
