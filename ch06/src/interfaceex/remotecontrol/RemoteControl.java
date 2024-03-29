package interfaceex.remotecontrol;

public interface RemoteControl {
	//  1.8버전 이후 일반 메서드와 정적 메서드 사용 가능!
	
	// 인터페이스 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	
	// 추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
	
	//일반 메서드 - default 키워드 사용
	//클래스에서는 default 안붙여도 되는데 인터페이스에서는 이렇게 해야된다
	default void setMute(boolean mute) {
		if(mute) {  // mute == true
			System.out.println("무음처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	
	
	// 정적 메서드(static)
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
	
	
	
	
	
}
