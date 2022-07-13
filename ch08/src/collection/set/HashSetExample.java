package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		// Set 자료구조 : 순서가 없고 중복저장이 불가
		// 이미 hashCode(), equals() 재정의 되어 있어서 중복 불가
		
		Set<String> set = new HashSet<>();
		
		
		// 요소 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP/Servlet");
		set.add("Java");   // 중복: 그래도 똑같이 총 객체수는 3개로 나온다(중복 허용x)
		set.add("MyBatis");
		
		//set의 크기
		System.out.println("총 객체수: " + set.size());   // 총 객체수: 4
		
		
		
		// 전체 요소 출력
		// 순서가 없어서 index i =0 ~~ 이거 안쓰고 Iterator 쓴다!!
		// iterator() : 순서에 상관없이 하나씩 접근
		// 반복자로 요소들을 꺼내옴 : 순서가 없으므로 반복자로 꺼내온다
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {   // 객체 수만큼 반복
			String element = iterator.next();   // 1개의 객체 가져오기
			System.out.println("\t" + element);  // 출력해도 넣은 순서랑 상관없이 출력된다!
		}
		
		
		
		
		
		// 요소 삭제
		set.remove("JDBC");
		System.out.println("총 객체수: " + set.size());   // 총 객체수: 3
		
		
		
		
		// 모든 요소 삭제
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
		System.out.println("총 객체수: " + set.size());   // 총 객체수: 0
	}

}
