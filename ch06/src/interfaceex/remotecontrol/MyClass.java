package interfaceex.remotecontrol;

public class MyClass {
	
	// 필드
	RemoteControl rc = new Television();  // 이게 필드
	
	
	// 기본 생성자
	public MyClass() {}
	
	
	// 생성자의 매개 변수
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
	void methodA() {
		// 지역변수(메소드 안에 위치)
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(10);
	}
	
	
	
	void method(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(7);
	}
	
	
}
