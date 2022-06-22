package type;

public class IntLongType {

	public static void main(String[] args) {
		
		// 정수 자료형
		
		// int 범위 : -21억 ~ 21억(총 개수 43억[32비트])
		int iNum = 123456789;
		System.out.println(iNum);
		
		
		// long 범위 : 64비트 , 숫자 뒤에 대문자 'L' 이나 소문자 'l' 써야!!
		// (int가 표준이기 때문에!)
		long lNum = 123456789012L;
		System.out.println(lNum);
	}

}
