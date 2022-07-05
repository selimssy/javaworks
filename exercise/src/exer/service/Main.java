package exer.service;

public class Main {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();  // 멤버로그인
		
		controller.setService(new AService());
		controller.service.login();  // A 로그인
		
		
	}

}
