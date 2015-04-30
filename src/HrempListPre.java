import java.sql.*;
import java.util.Scanner;

public class HrempListPre {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Scanner sc = new Scanner(System.in);

			// 키보드로 검색어 받음
			System.out.print("검색어 >");
			String keyword = sc.next();
			sc.close();

			// 1 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2 디비 콘 생성
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "hr", "hr");

			// 3 Statement 생성

			// 4 SQL문 날리기
			String sql = "select first_name, last_name, email, phone_number,"
					+ " hire_date from EMPLOYEES" + " where first_name like ?"
					+ " or last_name like ?";

			pstmt = conn.prepareStatement(sql);

			// 바인딩
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setString(2, "%" + keyword + "%");

			rs = pstmt.executeQuery();
			
			// 5 결과출력
			while (rs.next()) {
				String fname = rs.getString(1);
				String lname = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String hireDate = rs.getString(5);

				System.out.println(fname + ", " + lname + ", " + email + ", "
						+ phone + ", " + hireDate);
			}

		} catch (ClassNotFoundException ex) {
			System.out.println("oracle jdbc library가 없습니다.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			// 6 자원정리
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {

			}

		}
	}

}
