package exer.HttpServlet;

public class HttpServletExample {

	public static void main(String[] args) {
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
		
	}
	
	
	
	public static void method(HttpServlet servlet) {
		servlet.service();   // 로그인합니다
		                     // 파일 다운로드합니다.
	}
	
	
}
