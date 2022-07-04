package polymorphism.child;

public class ChildTest {

	public static void main(String[] args) {
		
		/*Child child = new Child();	
		Parent parent = child;     */
		
		Parent child = new Child();   // 자동 타입 변환
		child.method1();  // Child-method1
		child.method2();  // Child-method2
		
		
		

		
	}

}
