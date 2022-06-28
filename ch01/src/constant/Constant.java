package constant;

public class Constant {

	public static void main(String[] args) {
		// 상수 - 변하지 않는 값
		// 상수 선언할 때는 앞에 final 키워드 사용!
		
//		final int MONTH = 12;  // 내가만든 클래스 쓰려고 주석처리
		
//		int mymonth = UsingDefine.MYMONTH;   // static 있을 때
		UsingDefine mymonth = new UsingDefine();   //static 없을 때
		System.out.println("1년은 " + mymonth.MONTH + "개월이 있습니다.");  // 1년은 12개월이 있습니다.   
		
		final int MAX_NUM = 100;
		final int MIN_NUM = 1;
		
		
		
		//month = 6;   // final 사용하면(상수) 변경할 수 없다!
		//MAX_NUM = 1000;   // 상수라서 변경 불가
		
		
//		System.out.println(MONTH);    // 12
		System.out.println(MAX_NUM);    // 100
		
		
		// 원의 넓이 계산하기
		// area = radius * radius * PI
		
		final double PI= 3.14;    // 상수
		int radius = 5;
		double area = 0.0;
		
		// 연산 처리
		area = radius * radius * PI;
		
		System.out.println("원의 넓이: " + area);     // 78.5
	}

}
