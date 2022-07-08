package string;

public class StringSubString {

	public static void main(String[] args) {
		
		// subString(begin, end) - begin부터 end 직전까지의 문자 추출
		// subString(begin) - begin부터 끝까지 
		
		String ssn = "991125-2345678";
		
		String firstNum = ssn.substring(0, 6);   // 0부터 6 직전까지 개념이라 실질적으로 0부터 5까지 출력된다!
		System.out.println("주민등록번호 앞: " + firstNum);  // 991125
		
		
		String secondNum = ssn.substring(7);   // 인덱스 7부터 끝까지
		System.out.println("주민등록번호 뒤: " + secondNum);   // 2345678
	}

}
