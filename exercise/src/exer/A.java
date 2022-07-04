package exer;

public class A {
	
	// 필드와 메소드의 접근 제한
	
	// public: 모든 패키지에서 아무런 제한 없이 필드와 메소드 사용(접근) 가능
	// protected : 같은 패키지 내에서 접근 가능 + 다른 패키지에 속한 클래스가 해당 클래스의 자식이라면(상속했다면) 접근 가능
	// default: 생략했을때가 디폴트. 같은 패키지 내에서만 가능
	// private: 오로지 해당 클래스 내부에서만 가능
	
	
	// 필드
	public int field1;    // public
	int field2;          // 디폴트
	private int field3;   // private
	
	
	// 생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();	
	}  // 클래스 내부일 경우 접근 제한자의 영향을 받지 않는다!
	
	
	
	// 메소드
	public void method1() {}   // public
	void method2() {}         // 디폴트
	private void method3() {}  // private
	
}
