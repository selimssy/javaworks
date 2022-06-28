package builtinclass;

public class MathEx {

	public static void main(String[] args) {
		// Math 클래스 사용
		int v1 = Math.abs(-10);
		System.out.println(v1);     // 10
		
		int v2_1 = Math.round(5.6f);
		long v2_2 = Math.round(5.6);
		System.out.println(v2_1);   // 6
		System.out.println(v2_2);   // 6
//		반올림은 float 하는대신 f붙여줘야되고 안붙이면 long을 써야!
		
		
		
		double v3 = Math.floor(5.9);
		System.out.println(v3);   // 5.0
		
		
		int max = Math.max(10, 20);     // 두 수만 비교 가능
		System.out.println(max);    // 20
		
		
		double rand = Math.random();    // 0.0 이상 1 미만의 수 랜덤으로 출력
		System.out.println(rand);
		
		
		
		// 주사위 구현
		int dice = (int)(Math.random() * 6) + 1;      // int로 바꿔주면 소수점 알아서 버리니까!
		System.out.println("주사위 눈: " + dice);

	}

}
