package object;

public class EqualsTest {

	public static void main(String[] args) {
		
		String color1 = new String("빨강");
		String color2 = new String("빨강");
		
		// 주소(메모리)비교!!  == 으로 비교한다!!(주소같으면 true 다르면 false)
		System.out.println(color1 == color2);  // false (메모리주소 다르다)
		
		// 저장된 문자열 값 비교(equals())
		System.out.println(color1.equals(color2));  // true (저장된 문자열 값은 동일)
		
		
		
		
		Book book1 = new Book(12, "개미");
		Book book2 = new Book(12, "개미");
		
		// 주소(메모리)비교
		System.out.println(book1 == book2);  // false 
				
		// 저장된 문자열 값 비교
		System.out.println(book1.equals(book2));  // false 
		// 다르다고 나온다!  equals()도 재정의해줘야!!
		
		// 재정의 후에는 true로 나온다!
		
		
		
		
		// hashCode() 테스트
		System.out.println(color1.hashCode());   // 1555117
		System.out.println(color2.hashCode());   // 1555117
		
		
		// hashCode() 재정의 후 같아짐
		System.out.println(book1.hashCode());   // 12
		System.out.println(book2.hashCode());   // 12
		
		
	}

}
