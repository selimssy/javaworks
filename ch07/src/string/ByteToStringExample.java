package string;

public class ByteToStringExample {

	public static void main(String[] args) {
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		System.out.println(bytes[0]);  // 72
		
		// byte 코드를 문자로 반환
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);   // 두번째 74 인덱스 위치, 4개
		System.out.println(str2);
		
		
	}

}
