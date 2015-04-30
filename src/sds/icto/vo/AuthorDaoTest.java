package sds.icto.vo;

import java.sql.SQLException;
import java.util.List;

public class AuthorDaoTest {
	public static void main(String[] args) {
		//insertTest();
		try {
			selectTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void insertTest() throws ClassNotFoundException, SQLException {
		AuthorDao dao = new AuthorDao();

		// 1. 하나입력
		AuthorVo vo = new AuthorVo();
		vo.setName("장자");
		vo.setBio("");
		dao.insert(vo);

		// 1. 하나입력
		AuthorVo vo2 = new AuthorVo();
		vo2.setName("순자");
		vo2.setBio("");
		dao.insert(vo2);

	}
	
	public static void selectTest() throws ClassNotFoundException, SQLException{
		AuthorDao dao = new AuthorDao();
		List<AuthorVo> list = dao.fetch();
		
		for(AuthorVo vo : list){
			System.out.println(
			vo.getId() + " : "+ vo.getName() +" : "+  vo.getBio()	
			);
		}
	}

}
