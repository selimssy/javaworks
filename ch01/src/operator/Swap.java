package operator;

public class Swap {

	public static void main(String[] args) {
		// 변수의 값 서로 바꾸는 프로그램
		
		int x = 0, y = 1;
		int swap = 0;
		
		swap = x;
		x = y;		
		y = swap;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
