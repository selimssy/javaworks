package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
				
		// Map 객체 map 생성
		// map: 순서가 없고 중복 불가(key가 중복 불가, value는 중복 가능)
		Map<String, Integer> map = new HashMap<>();
		
		
		
		// 객체 저장
		map.put("이순신", 85);
		map.put("홍길동", 90);
		map.put("강감찬", 80);
		map.put("홍길동", 70);    // 총 객체수 그대로고 value는 나중에 입력한 값으로 저장(즉, 변경 기능)
		
		
		
		// map 크기
		System.out.println("총 객채수: " + map.size());  // 총 객채수: 3
		
		
		
		// 객체 1개 찾기: key를 통해서 값(value)을 가져옴
		System.out.println( map.get("홍길동"));     // 70
		
		
		
		
		
		
		// 전체 객체 출력
		//Set<String> keySet = map.keySet();     // Set 자료구조 이용
		// 반복자 얻기
		//Iterator<String> iterator = keySet.iterator();         // 반복자 객체 얻기
		
		//<한번에 하려면>
		Iterator<String> iterator = map.keySet().iterator();		
		while(iterator.hasNext()) {  // 객체를 계속 가지고 있으면
			String key = iterator.next();    // 1개의 키를 가져와서
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);    // 역시 넣은 순서랑 상관없이 출력(순서가 없다)
		}
		
		
		
		
		// 객체 삭제	
		map.remove("강감찬");  // 키로 삭제한다!
		System.out.println("총 객채수: " + map.size());  // 총 객채수: 2
		
		
		
		
		// 자료 존재 유무
		if(map.containsKey("이순")) {
			System.out.println("자료가 있음");      
		}else {
			System.out.println("자료 없음");
		}
		
		
		
		
		// 향상 for문
		Set<String> keys = map.keySet();      // keyset() : key값을 반환
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		
		
	}

}
