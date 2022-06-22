package ch01;

public class TypeConversion {

	public static void main(String[] args) {
		// 묵시적 형 변환
		
		// 실수가 정수보다 큰 자료형이다!!
		int iNum = 20;
		float fNum = iNum;   // 작은쪽(정수)에서 큰쪽(실수)으로 저장되서 20.0이 된다
		System.out.println(iNum);    // 20
		System.out.println(fNum);    // 20.0
		
		
		double dNum;
		dNum = iNum + fNum;
		System.out.println(dNum);    // 40.0  (20 + 20.0)
		
		
		
		
		
		// 명시적 형 변환
		double dNum2 = 1.2;
		float fNum2 = 0.9F;   // float는 숫자 뒤에 f 안넣으면 에러난다!
		
		// int iNum2 = dNum2 + fNum2;  에러난다!(더 작은 자료형인 int에 실수를 담을 수 없다) 
		int iNum2 = (int)dNum2 + (int)fNum2;   // 실수부분 손실(1 + 0 이 된다)
		int iNum3 = (int)(dNum2 + fNum2);   // 2.1 에서 실수부분 날라가서 2
		
		
		
		System.out.println(iNum2);    // 1 
		System.out.println(iNum3);    // 2
		
	}

}
