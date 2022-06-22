package ch01;

public class ByteShorttype {

	public static void main(String[] args) {
		// 정수 자료형
		
		// byte 자료형 범위 : -128 ~ 127(총 256개[8비트])
		byte bData = -128;
		System.out.println(bData);		
		
		// byte bData2 = 128;  범위 초과이므로 오류
		
		
		// short 자료형 범위 : -32768 ~ 32767(총 65536개[16비트])
		short sData = 32767;
		System.out.println(sData);
		
		// short sData2 = 32768;  범위 초과이므로 오류
	}

}
