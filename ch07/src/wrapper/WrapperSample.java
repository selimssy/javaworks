package wrapper;

import java.util.ArrayList;

public class WrapperSample {

	public static void main(String[] args) {
		
		// int n = 10;
		
		
		// Integer의 num1 객체(그래서 아래에서 .intValue() 해준다) 
		Integer num1 = 100;     // 박싱(boxing)- 자동형변환(기본형 -> 클래스형)
		int num2 = 200;
		int sum = num1.intValue() + num2;    // 언박싱(객체 -> 기본형)
		System.out.println(sum);   // 300
		
		
		
		
		// ValueOf() 메서드 : 문자열을 숫자로 변환하는 메서드
		Integer n1 = Integer.valueOf("300");
		System.out.println(n1);    // 300
		
		
		
		//parseInt() : 문자열을 정수로 반환
		int n2 = Integer.parseInt("400");
		System.out.println(n2);  // 400
		
		
		
		
		// Integer Type으로 사용
		ArrayList<Integer> numList = new ArrayList<>();
		
		// 정수 저장
		numList.add(1);
		numList.add(2);
		numList.add(3);
		
		// 출력
		for(Integer num: numList) {
			System.out.print(num + " ");     // 1 2 3
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
