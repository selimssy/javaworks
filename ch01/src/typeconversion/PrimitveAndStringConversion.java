package typeconversion;

public class PrimitveAndStringConversion {

	public static void main(String[] args) {
		
		// 문자열을 각각 int, double, boolean으로 변환
		int value1 = Integer.parseInt("10");
		System.out.println(value1);   // 10
		
		double value2 = Double.parseDouble("3.14");
		System.out.println(value2);  // 3.14
		
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println(value3);  // true
		
		
		
		// 문자열로 각각 int, double, boolean으로 변환
		String str1 = String.valueOf(10);
		System.out.println(str1); // 10
		
		String str2 = String.valueOf(3.14);
		System.out.println(str2); // 3.14
		
		String str3 = String.valueOf(true);
		System.out.println(str3);  // true

	}

}
