package a22_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a22_데이터베이스.Dto.User;
import db.DBConnectionMgr;

public class InsertData {
	
	private DBConnectionMgr pool;
	
	public InsertData(DBConnectionMgr pool) {
		this.pool = pool; 
	}
	
	public void InsertUser(User user) { //중요/ 객체는 dto User
		String sql = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			sql = "insert into user_mst values(0, ?, ?, ?, ?, now(), now())"; //0 없이 물음표가 맨앞에 있어도 1번임
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.executeUpdate(); //insert 된 개수가 return됨
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //다쓴 튜브 돌려주기
			pool.freeConnection(con, pstmt); //쓴것만 반납해야함
		}
		
		System.out.println("회원 가입 완료");
	}
	
	public User getUser(String username) {
		String sql = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		
		try {
			con = pool.getConnection();
			sql = "select * from user_mst where username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery(); //select만 executeQuery, return이 ResultSet이라서 rs에 넣어줌
			
			rs.next(); //iterator 처럼 bof에 있다가 next호출시 그 다음 행으로 감

			user = User.builder()
						.user_code(rs.getInt(1)) //rs.getInt(1); //usercode라서 int, 1부터 시작함
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getString(5))
						.build();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return user;
		
	}
	
	public static void main(String[] args) {
		InsertData insertData = new InsertData(DBConnectionMgr.getInstance()); //getInstance는 싱글톤
		
		User user1 = User.builder()
						.username("hello")
						.password("1234")
						.name("다영")
						.email("wou3768@gmail.com")
						.phone("010-7207-3926")
						.addr("연제구")
						.build();
		
		//insertData.InsertUser(user1);
		System.out.println(insertData.getUser("hello"));
	}

}
