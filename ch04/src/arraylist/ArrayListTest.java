package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// 자료 구조 - ArrayList 클래스 사용
		ArrayList<String> cart = new ArrayList<>();   // ArrayList 클래스 import해야
		// 기본적으로 10개가 생기고 10개 넣고 한 개 더 넣으면 자동으로 11개가 된다
		
		//자료 입력(저장)
		cart.add("커피");
		cart.add("생수");
		cart.add("계란");
		
		// 리스트의 크기
		System.out.println(cart.size() + "개");   // 3개
		
		// ArrayList의 특정 요소 1개 출력:  객체이름.get(인덱스번호)
		System.out.println(cart.get(0));   // 커피
		
		// 전체 조회
		for(int i = 0; i < cart.size(); i++) {   //ArrayList라서 .size() 써야!!  .length아님 주의!
			String c = cart.get(i);
			System.out.println(c);
			//System.out.println(cart.get(i)); 
		}
		
		
		System.out.println();
		// 자료 삭제
		// ArrayList는 삭제하면 인덱스번호도 하나씩 땡겨진다!
		cart.remove(1); 
		
		
		// 자료 수정 : 이름.set(인덱스번호, 값)
		cart.set(0, "라면");
		
		
		// 향상된 for문으로 조회
		for(String c: cart) {
			System.out.println(c);
		}
		
		
		
	}

}
