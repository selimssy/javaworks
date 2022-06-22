package ch01;

public class StringType {

	public static void main(String[] args) {
		// 문자열 자료형
		
		//String s = 'k'   에러난다! String은 쌍따음표!!
		//char s = 'k' 이건 된다

		
		String s = "k";
		String name = "Ja" + "Va";
		String str = name + 8.0;     // 문자와 숫자 연결하면 숫자를 문자로 인식!(숫자가 형변환된다)
		
		System.out.println(name);   // JaVa
		System.out.println(str);	// JaVa8.0
	}

}
