package string;

public class StringCharAt {

	public static void main(String[] args) {
		
		
		// charAt() - 매개값으로 주어진 인덱스의 문자를 리턴
		
		String subject = "자바 프로그램";
		char charValue = subject.charAt(0);
		System.out.println(charValue);  // 자
		
		
		// 주민등록번호에서 남자와 여자 구분
		String ssn = "950815-1234567";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1': case '3':       // gender가 char이라서 홀따음표 안에 넣어줘야!
			System.out.println("남자입니다.");
			break;
			
		case '2': case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
