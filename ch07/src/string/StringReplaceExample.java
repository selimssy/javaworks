package string;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		
		// Replace
		
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);   // 자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.
		System.out.println(newStr);   // JAVA는 객체 지향 언어입니다. JAVA는 풍부한 API를 지원합니다.
		
		
		
		
		// Substring
		
		String ssn = "880815-1234567";
		 
		String firstNum = ssn.substring(0, 6);   // 인덱스 0번부터 6 직전까지
		System.out.println(firstNum);  // 880815
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);  // 1234567
		
		
	}

}
