package generic.box2;

import generic.box.Apple;

public class BoxTest {

	public static void main(String[] args) {
		
		// String type
		Box box = new Box();
		box.set("Good Luck!");
		String msg = (String)box.get();   // 우변은 객체(Object)라서 더 크니까 형변환해줘야!
		System.out.println(msg);  // Good Luck!

		
		
		// Apple 클래스 
		box.set(new Apple("사과"));
		Apple apple = (Apple)box.get();
		System.out.println(apple);  // 사과
		
		
		
	}

}
