package string;

public class StringTrim {

	public static void main(String[] args) {
		
		
		String oldStr = "      자바 프로그래밍";
		String newStr = oldStr.trim();
		System.out.println(newStr);   // 자바 프로그래밍       // 중간 공백은 제거하지 않는다!!
		
		
		
		
		String tel1 = "   02";
		String tel2 = "123    ";
		String tel3 = "     1234     ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);  // tel1.trim()
		
	}

}
