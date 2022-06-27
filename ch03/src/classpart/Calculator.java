package classpart;

public class Calculator {
	// 필드가 꼭 있어야되는거 아니다 메서드만 있어도 된다
	
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	
	
	
	public int sub(int n1, int n2) {
		return n1 - n2;
	}
	
	
	
	public int mul(int n1, int n2) {
		return n1 * n2;
	}
	
	
	
	public double div(int n1, int n2) {
		return n1 / (double)n2;   // 계산은 기본적으로 int로 되서 double로 해줘야!!
	}
	
	
}
