package interfaceex.remotecontrol;

public class SmartTVTest {

	public static void main(String[] args) {
		
		SmartTV tv = new SmartTV();
		
		
		// 구현한 객체(tv)를 인터페이스 타입에 대입
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		rc.turnOn();  // TV를 켭니다.
		searchable.search("www.naver.com");  // www.naver.com을 검색합니다.
		rc.turnOff();  // TV를 끕니다.
	}

}
