package constructor;

public class Number {
	
	int x;  // 필드 : 멤버변수
	
	public Number() {    // 생성자
		x = 4;
	}

	public static void main(String[] args) {
		// 자신 클래스 사용
		Number myNum = new Number();
		System.out.println(myNum.x);   // 4
	}

}
