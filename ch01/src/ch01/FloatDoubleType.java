package ch01;

public class FloatDoubleType {

	public static void main(String[] args) {
		// 실수 자료형
		// Double을 표준으로 사용
		
		// float는 숫자 뒤에 f나 F를 써서 사용
		// float 정밀도는 소수 6자리까지, double은 16자리까지 (즉, 정밀한걸 쓸땐 double을 사용해야!)
		float fNum = 1.23456789F;
		double dNum = 1.2345678901234567;
		
		
		System.out.println(fNum);   // 1.2345679(잘린다)
		System.out.println(dNum);   // 1.2345678901234567

		
	}

}
