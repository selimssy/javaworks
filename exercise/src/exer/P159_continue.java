package exer;

public class P159_continue {

	public static void main(String[] args) {
		
		// continue써서 홀수는 넘어가고 짝수만 출력되도록
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
