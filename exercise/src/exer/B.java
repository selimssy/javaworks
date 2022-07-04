package exer;

public class B {
	
	public B() {
		
		A a = new A();
		
		a.field1 = 1;     // public이라 접근 가능
		a.field2 = 1;     // 디폴트라 가능(여긴 같은 패키지 내)
		// a.field3 = 1;  // field3은 private라서 접근 불가!
		
		
		a.method1();	// public이라 접근 가능
		a.method2();	// 디폴트라 가능(여긴 같은 패키지 내)
		// a.method3();    // method3() 역시 private라서 접근 불가
		
	}
	
}
