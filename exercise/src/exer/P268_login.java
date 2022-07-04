package exer;

public class P268_login {
	
	
	boolean login(String id, int password) {
		if(id.equals("hong") && password == 12345) {
			return true;
		}else {
			return false;
		}
	}
	
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	

	public static void main(String[] args) {
		// login() 메소드와 logout() 메소드
		// login()은 매개값으로 id와 password 제공, id가 "hong", password가 "12345"일 경우에만 true, 그 외에는 false 리턴
		// logout은 패스워드만 제공, "로그아웃 되었습니다" 출력
		
		
		 
		P268_login practice = new P268_login();
		System.out.println(practice.login("hong", 12345));   // true
		System.out.println(practice.login("hong", 123));   // false
		practice.logout("hong");  // 로그아웃 되었습니다.

	}

}
