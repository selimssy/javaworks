package ch01;

public class TypeConversion2 {

	public static void main(String[] args) {
		// 사칙 연산
		int x = 10, y = 20;
				
		System.out.println(x + y);   // 30
		System.out.println(x - y);   // -10
		System.out.println(x * y);   // 200
		System.out.println(x / y);    // 0   //숫자는 int가 기본형이라서 소수점은 손실되서 출력! 따라서 제대로 출력하려면 형변환해줘야!
		
		System.out.println((double)x / y);    // 0.5     // double로 형변환!
	}

}
