package object.system;

public class ExitExample {
	
	public static void main(String[] args) {
		
		// 반복구문을 강제 종료
		for(int i = 0; i < 10; i++) {
			if(i==5) {
				// break;
				System.exit(0);   // 정상 종료  // 여기서 완전히 종료시켜버리는거라 밑에 "반복 종료" 출력 안한다!!
			}
			System.out.println(i);
		}
		System.out.println("반복 종료");
	}
}
