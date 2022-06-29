package exer;

public class P85 {

	public static void main(String[] args) {
		
		// 타입 크기
		// byte < short < int < long < float < double
		
		// char도 int로 자동형변환, char의 경우 int타입으로 변환되면 유니코드 값이 int 타입에 저장
		
		
		// 2
		int int1 = 10;
		char char1 = 'a';
		double double1 = 5.7;
		String stl1 = "a";
		
		double var1 = (double)int1;
		byte var2 = (byte)int1;
		int var3 = (int)double1;
		//char var = (char)str1;  // 컴파일 에러
		
		
		
		// 3
		byte b1 = 10;
		float f1 = 2.5f;
		double d1 = 2.5;
		
		byte result = (byte)(b1 + b1);  // 컴파일 에러 오른족 int인가보다..
		int r2 = 5 + b1;
		float r3 = 5 + f1;
		
		
		
		//10
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;

		
		// 변수명.getClass().getName() 으로 type 확인
		System.out.println(str1);  // 5
		System.out.println(str2);  // 23
		System.out.println(str3);  // 23
		
	
		
		
		

	}

}
