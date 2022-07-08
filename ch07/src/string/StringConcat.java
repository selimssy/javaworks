package string;

public class StringConcat {

	public static void main(String[] args) {
		
		//concat() : 문자열 연결하기
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);  // java
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));  // 처음 문자열 주소 값: 961419791
		
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);  // javaandroid
		System.out.println("연결 후 문자열 주소 값: " + System.identityHashCode(javaStr));  // 연결 후 문자열 주소 값: 665188480(달라졌다!)
	}

}
