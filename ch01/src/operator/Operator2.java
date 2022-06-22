package operator;

public class Operator2 {

	public static void main(String[] args) {
		// 증가, 감소 연산자
		
		int num = 10;
		int val = 0;
		
		 val = num++;   
		// val = num, num = num + 1 이렇게 된다
		System.out.println(val);    // 10
		System.out.println(num);    // 11
		
		
		
		
		
		num = 10;
		val = 0;
		
		val = ++num;  
		// num = num + 1, val = num 이 순서!
		System.out.println(val);    // 11
		System.out.println(num);    // 11
		
		
		
		num = 10;
		val = 0;
		
		val = num--;
		System.out.println(val);    // 10
		System.out.println(num);    // 9
		
		
		num = 10;
		val = 0;
		
		val = --num;
		System.out.println(val);    // 9
		System.out.println(num);    // 9
		
		
		
		// 산술 연산자 - 총점과 평균
		int mathScore = 90, engScore = 75;
		int totalScore = 0;
		double avgScore = 0.0;
		
		// 총점
		totalScore = mathScore + engScore;
		
		//평균
		avgScore = (double)totalScore / 2;   // 나눗셈 할 때 형변환 항상 생각해야
		// avgScore = totalScore / 2.0; // 이렇게해도 된다(자동형변환)
		
		// 출력
		System.out.println(totalScore);   // 165
		System.out.println(avgScore);    // 82.5
		
	}

}
