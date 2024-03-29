package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	
	private static String driverclass = "oracle.jdbc.OracleDriver";    // 오라클 드라이버
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";   // db 경로
	private static String username = "system";
	private static String password = "12345";
	

	public static void main(String[] args) {
		// 연결 객체 선언
		Connection conn = null;
		
		try {
			Class.forName(driverclass);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection 객체 생성 - db 연결됨" + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
