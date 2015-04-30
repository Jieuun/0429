import java.sql.*;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2 디비 콘 생성
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			//3 Statement 생성
			stmt = conn.createStatement();
			
			//4 SQL문 날리기
			String sql = "select * from departments";
			rs = stmt.executeQuery(sql);
			
			//5 결과출력
			while(rs.next()){
				long id= rs.getLong(1);
				String name = rs.getString(2);
				
				System.out.println( id+ " : "+ name);
			}
			

			System.out.println("연결성공!!");

		} catch (ClassNotFoundException ex) {
			System.out.println("oracle jdbc library가 없습니다.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			//6 자원정리
			try {
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {

			}
		}
	}

}
