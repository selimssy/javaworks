package exer;

public class P330_TEST {

	public static void main(String[] args) {
		
		P330_Child obj = new P330_Child();  // 다나오네..
		
		/*
		 * 결과: Parent(String nation) call
				Parent() call
				P330_Child(String name) call
				P330_Child() call

		 * */
		
		
		// 자식 객체가 생성될 때에는 무조건 부모객체의 생성자를 먼저 초기화한 후
		// 자식객체가 생성된다. 때문에 자식클래스의 생성자에 super()메소드가 없더라도
		// 컴파일러가 자동으로 super()를 넣어 실행하게 된다
		// 때문에 super()가 없더라도 부모의 생성자부터 초기화된다
		  
	}

}
