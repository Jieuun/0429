package sds.icto.vo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDao {
	private Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Connection conn = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2 디비 콘 생성
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(dburl, "icto55", "icto55");

		return conn;
	}

	public List<AuthorVo> fetch() throws ClassNotFoundException, SQLException {
		List<AuthorVo> list = new ArrayList<AuthorVo>();

		// 1 connection 생성
		Connection conn = getConnection();

		Statement stmt = conn.createStatement();

		String sql = "select * from author";
		ResultSet rs = stmt.executeQuery(sql);

		// 4 결과처리
		while (rs.next()) {
			Long id = rs.getLong(1);
			String name = rs.getString(2);
			String bio = rs.getString(3);

			AuthorVo vo = new AuthorVo();
			vo.setId(id);
			vo.setName(name);
			vo.setBio(bio);

			list.add(vo);
		}
		// 5 자원정리
		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}

		return list;

	}

	public void insert(AuthorVo vo) throws ClassNotFoundException, SQLException {

		//connection 생성
		Connection conn = getConnection();

		//statement sql 준비
		String sql = "insert into author values(seq_author.nextval, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		// 바인딩
		pstmt.setString(1, vo.getName());
		pstmt.setString(2, vo.getBio());

		// query 설정
		pstmt.executeUpdate();

		//자원정리

		if (pstmt != null) {
			pstmt.close();
		}
		if (conn != null) {
			conn.close();
		}

	}

}
