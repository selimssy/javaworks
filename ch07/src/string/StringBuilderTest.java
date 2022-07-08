package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// String 클래스는 문자열 연결할 때 메모리 낭비가 발생 // StringBuiler를 사용하면 낭비 안된다!
		// StringBuiler - 내부에 변경 가능한 char[] 변수를 가지고 있다 (추가 메모리를 사용하지 않는다!)
		
		String javaStr = new String("java");
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));  // 처음 문자열 주소 값: 961419791
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer)); // 연산 전 buffer 메모리 주소: 665188480
		
		// 문자열 추가
		buffer.append(" and");
		buffer.append(" android");	
		buffer.append(" / programming is fun!");
		
		javaStr = buffer.toString();

		System.out.println(javaStr);  // java and android / programming is fun!
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer)); // 연산 전 buffer 메모리 주소: 665188480(똑같다!!)
		
		
	}

}
