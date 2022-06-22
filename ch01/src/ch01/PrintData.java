package ch01;

public class PrintData {

	public static void main(String[] args) {
		// 숫자
		System.out.println(100);
		System.out.println(3.3);
		System.out.println(100 + 10);
		System.out.println("============================");
		
		
		
		//문자
		System.out.println('A');   // 문자 1개는 홀따옴표
		System.out.println("B");   // 쌍따옴표는 문자열표기 (1개써도 되긴하는데 원래 쌍따는 문자열)
		System.out.println("banana");   // 이런 문자열은 홀따에 쓰면 에러난다(컴파일에러)! 
		System.out.println(100 + "10");   // 10010 (이런 경우엔 100도 문자로 인식!(숫자와 문자일땐 100이 문자로 형변환된다))
		System.out.println("AB" + "CDE");
		System.out.println("============================");
		
		
		// 불리언(boolean)
		System.out.println(true);
		System.out.println(4 > 5);
	}

}
