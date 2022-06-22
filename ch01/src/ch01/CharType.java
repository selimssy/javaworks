package ch01;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - 아스키 코드(유티코드도 포함)
		// char : 2바이트
 		char ch1 = 'A';  // 문자형 변수 ch1에 'A'를 저장
		System.out.println(ch1);  // A
		System.out.println((int)ch1);  // 65   (int)로 형변환 했다!!
		
		
		
		char ch2 = 66;
		System.out.println(ch2);   // B   문자형으로 선언했어서 이렇게 출력된다
		// 숫자를 저장해도 선언을 char로 하면 출력할 때 그거에 해당하는 아스키코드
		// 문자가 출력된다!! 저렇게 문자로 선언하고 65를 저장하면 출력했을 때 A 출력!
		
		
		System.out.println("========유니코드==========");
		
		char uniCode1 = '한';
		System.out.println(uniCode1);   // 한
		
		
		char uniCode2 = '\uD55C';   // '한'을 뜻하는 유니코드, 한글자이다
		System.out.println(uniCode2);   // 한
		
		
		// 영어 소문자 출력
		for(char c = 97; c < 123; c++) {
			System.out.print(c + " ");
		}
	}

}
