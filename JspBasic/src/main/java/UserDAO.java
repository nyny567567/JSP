import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.myweb.user.model.UserVO;

//DAO(Data
//무분별한 객체 생성을 막기 위해 싱글톤 디자인 패턴으로 구축합니다.
public class UserDAO {
	
	//커넥션 풀의 정보를 담을 변수를 선언.
	private DataSource ds;
	
	private UserDAO() {
		//커넥션 풀 정보 불러오기.
		try {
		 InitialContext ct = new InitialContext();
		 ds = (DataSource) ct.lookup("java:comp/env/jdbc/myOracle");
	} catch (NamingException e) {
		e.printStackTrace();
	}
	}
	
	
	private static UserDAO dao = new UserDAO();
	public static UserDAO getInstance() {
		if(dao == null) {
			dao = new UserDAO();
		}
		return dao;
	}
	
	//////////////////////////////////////////////////
	
	//회원 중복 여부 확인
	public boolean confirmId(String id) {
		String sql = "SELECT * FROM my_user WHERE user_id=?";
		boolean flag = false;
		try(Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) flag = true;
			return rs.next();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	public void insertUser(UserVO vo) {
		String sql = "INSERT INTO my_user VALUES(?,?,?,?,?)";
		try(Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, vo.getUserId());
			pstmt.setString(2, vo.getUserPw());
			pstmt.setString(3, vo.getUserName());
			pstmt.setString(4, vo.getUserEmail());
			pstmt.setString(5, vo.getUserAddress());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
