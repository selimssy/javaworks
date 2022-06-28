package typeconversion;

public class OperationPromotion {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2= 20;
		//byte byteValue3 = byteValue1 + byteValue2;   // 컴파일 에러(오른쪽은 int라서?)
		int intValue1 = byteValue1 + byteValue2;  // int로 정의하면 에러 안난다
		
		
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;  // 컴파일 에러(이 경우에도 더하면 int인가..?)
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드: " + intValue2);    // 유니코드: 66
		System.out.println("출력문자: " + (char)intValue2);   // 출력문자: B
		
		
		
		int intValue3 = 10;
		
		
		

	}

}
