package string;

public class StringIndexOf {

	public static void main(String[] args) {
		
		
		// indexOf("str") - 문자열이 시작되는 인덱스를 리턴
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);  //3
		
		
		
		// 문자열 검색 
		if(subject.indexOf("자바") != -1) {    // 해당 문자열 없으면 무조건 -1 반환!!  >= 0 으로 해도된다
			System.out.println("자바와 관련된 책이군요!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요!");
		}
		
		
	}

}
