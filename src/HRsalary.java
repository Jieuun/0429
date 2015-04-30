import java.sql.*;
import java.util.Scanner;

public class HRsalary {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("월급[min max] >");
		int minSalary = sc.nextInt();
		int maxSalary = sc.nextInt();


		// 1 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2 디비 콘 생성
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(dburl, "hr", "hr");

		// 3 Statement 생성
		stmt = conn.createStatement();

		String sql = "select first_name, last_name, salary from EMPLOYEES"
				+ " where salary>" + minSalary + " and salary<" + maxSalary;

		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			String fname = rs.getString(1);
			String lname = rs.getString(2);
			int salary = rs.getInt(3);
			System.out.println(fname + " " + lname + " : " + salary);

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
