package jdbcproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbcproject.common.JDBCUtil;

//DAO: DB작업 수행하는 코드
public class PersonDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// CRUD(CREATE REAE(select에 해당) UPDATE DELETE)
	
	// 자료 삽입
	public void inssertPerson(Person person) {
		try {
			conn = JDBCUtil.getConnection();
			String sql = "INSERT INTO person(userid, userpw, name, age) VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.setString(2, person.getUserPw());
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());
			pstmt.executeUpdate();   //db에 저장
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
		
		}

	
	
	// 자료 전체 조회
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		// db 연결
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM person";
		try {
			pstmt = conn.prepareStatement(sql);   // sql 실행
			rs = pstmt.executeQuery();   // 데이터 반환받음
			while(rs.next()) {   // 자료가 있는 동안 반복
				Person person = new Person();
				person.setUserId(rs.getString("userid"));   // db 테이블의 칼럼 가져와서 person 객체에 세팅
				person.setUserPw(rs.getString("userPw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);   // 생성 객체를 ArrayList에 저장
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);   // rs 있는걸로 종료해야
		}
		
		return personList;
	}
}

	
	
	
	
	
	// 자료 수정
	
	
	
	
	
	// 자료 삭제
	

