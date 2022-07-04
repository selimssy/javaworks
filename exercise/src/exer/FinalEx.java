package exer;

public class FinalEx {
	
	int num = 10;
	final int NUM = 100;   // 상수
	
	public static void main(String[] args) {
		FinalEx cons = new FinalEx();
		cons.num = 20;
		// cons.NUM = 200;  // 변경 불가
		
		System.out.println(cons.num);  // 20
		System.out.println(cons.NUM);  // 100
	}
}
