package exer;

public class CellPhone_Test {

	public static void main(String[] args) {
		
		// CellPhone_Dmb 객체 생성
		CellPhone_Dmb dmbphone = new CellPhone_Dmb("자바폰", "검정", 10);
		
		
		// CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: " + dmbphone.model);   // 자바폰
		System.out.println("모델: " + dmbphone.color);   // 검정
		
		
		// CellPhone_Dmb 클래스의 필드
		System.out.println("채널: " + dmbphone.channel);  // 채널: 10
		
		
		// CellPhone 클래스로부터 상속받은 메소드 호출
		dmbphone.powerOn();  // 전원을 켭니다.
		dmbphone.bell();   // 벨이 울립니다.
		dmbphone.sendVoice("안녕하세요");  // 내용: 안녕하세요
		dmbphone.receiveVoice("안녕하세요! 저는 홍길동입니다.");  // 상대방: 안녕하세요! 저는 홍길동입니다.
		dmbphone.sendVoice("아~ 예 반갑습니다");  // 내용: 아~ 예 반갑습니다
		dmbphone.hangUp();  // 전화를 끊습니다.
		
		
	}

}
