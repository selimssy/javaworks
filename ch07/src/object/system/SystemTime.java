package object.system;

public class SystemTime {

	public static void main(String[] args) {
		
		// 수행 시간 측정
		//long start = System.currentTimeMillis();    // System.currentTimeMillis() 반환값이 long이다!!  // 밀리초
		long start = System.nanoTime();   // 나노초
		
		
		// 1부터 백만까지 더하는데 걸리는 시간 구하기
		int sum = 0;
		for(int i = 0; i <= 1000000; i++) {
			sum +=i;
		}
		
		//long end = System.currentTimeMillis(); 
		long end = System.nanoTime();
		
		System.out.println(sum);
		//System.out.println("소요 시간: " + (end-start) + "밀리초");
		System.out.println("소요 시간: " + (end-start) + "나노초");
	}

}
