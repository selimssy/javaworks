package exer;

public class P143_switchcase {

	public static void main(String[] args) {
		
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[현재 시각: " + time + "시]");
		
		
		switch(time) {     // 현재 시각부터 끝까지 쭉 이어지도록 break 걸지 않는다!!
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		
		
		
		
		
		char grade = 'B';
		
		switch(grade) {
		case 'A': case 'a':   // 콜론 없이 그냥 옆으로!!
			System.out.println("우수 회원입니다.");
			break;
			
		case 'B': case 'b':
			System.out.println("일반 회원입니다.");
			break;
		
		case 'C': case 'c':
			System.out.println("손님입니다.");
			break;
		}
		
		
		
		
		
		
		
		System.out.println("어떤 혜택을 원하세요?");
		char level = 'A';
		switch(level) {
		case 'A': System.out.println("VVIP 혜택을 받으실 수 있습니다.");
		case 'B': System.out.println("VIP 혜택을 받으실 수 있습니다."); break;
		case 'C': System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
		case 'D': System.out.println("일반 회원 혜택을 받으실 수 있습니다."); break;
		default: System.out.println("혜택이 없습니다.");
		}

	}

}
