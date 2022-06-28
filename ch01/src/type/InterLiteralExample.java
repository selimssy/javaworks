package type;

public class InterLiteralExample {

	public static void main(String[] args) {
		int v1 = 0b1011;  // 2진수
		int v2 = 0206;    // 8진수..?
		int v3 = 365;   // 10진수
		int v4 = 0xB3;  // 16진수
		
		
		System.out.println("v1: " + v1);   // 11
		System.out.println("v2: " + v2);   // 134
		System.out.println("v3: " + v3);   // 365
		System.out.println("v4: " + v4);   // 179

	}

}
