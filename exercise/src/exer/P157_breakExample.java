package exer;

public class P157_breakExample {

	public static void main(String[] args) {
		
		while(true) {
			int num = (int)(Math.random()*6 + 1);
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		// 158
		// 바깥 for문은 A ~ Z까지 반복하고 중첩된 for문은 a ~ z까지 반복/ 충첩된 for문에서 변수가 g를 갖게 되면 완전히 빠져나오도록
		
		Outbox: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower='a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outbox;          // 뭐라고 정하는지는 내마음인듯?
				}
			}
		}
		System.out.println("프로그램 실행 종료");
		
		
		
		

	}

}
