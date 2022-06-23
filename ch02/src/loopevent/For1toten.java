package loopevent;

public class For1toten {

	public static void main(String[] args) {
		// for문으로 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 1부터 10까지의 합계
		int i;
		int sumV;
		for(i = 1, sumV = 0; i <= 10; i++) {  // 이렇게 선언만 위에서 하고 할당은 for 안에서 하기도 한다!
			sumV += i;		
			System.out.println("i=" + i + ", sumV = " + sumV);
		}
		System.out.println(sumV);   // 55

	}

}
