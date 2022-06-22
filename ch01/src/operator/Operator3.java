package operator;

public class Operator3 {

	public static void main(String[] args) {
		// 비교, 논리 연산자
		
		System.out.println(7 < 4);    // false
		System.out.println(7 <= 4);   // false
		System.out.println(7 == 4);   // false
		System.out.println(7 != 4);   // true
		
		
		// 논리 연산자
		System.out.println((7 < 4) && (7 == 4));   // 단락회로로 인해 뒤가 Dead code라고 뜬다!!
		System.out.println((7 > 4) || (7 == 4));   // 이것도 역시
		System.out.println(!(7 > 4));   // false
		
		
		
		// 단락회로 예제
		// &&인 경우: 앞 조건이 거짓이면 뒤 조건은 연산하지 않음
		// ||인 경우 : 앞 조건이 참이면 뒤 조건은 연산하지 않음
		
		int n = 10, i = 2;
		boolean x = ((n = n + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(x);   // false
		System.out.println(n);   // 20   // 여기는 연산된다
		System.out.println(i);   // 2    // 단락회로로 인해 && 뒤에꺼는 연산 자체를 안한다!!
		
		boolean y = ((n = n + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(y);   // true
		System.out.println(n);   // 30   // 여기는 연산된다
		System.out.println(i);   // 2    // 단락회로로 인해 || 뒤에꺼는 연산 자체를 안한다!!
		
	}

}
