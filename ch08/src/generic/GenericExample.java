package generic;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		// 요소 추가(객체 추가)
		list.add("grape");
		list.add("egg");
		list.add("coffee");
		
		System.out.println(list);    // [grape, egg, coffee]  String형은 for문 안돌려도 이렇게 나온다!!
		
		System.out.println(list.get(2));  // coffee
		
		
		
		// 왜 제네릭 프로그래밍을 하는가? 타임을 정해주지 않으면 Object형이 되므로 형변환이 필요하다!
		ArrayList cart = new ArrayList();
		cart.add("포도");
		cart.add("계란");
		cart.add("커피");
		
		String str = (String)cart.get(1);   // 우변은 객체레서 더 크니까 형변환해줘야!
		System.out.println(str);   // 계란
		
		
	}

}
