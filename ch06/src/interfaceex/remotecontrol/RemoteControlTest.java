package interfaceex.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		// 객체 생성
		// Television tv = new Television();
		
		// 인터페이스 타입으로 객체 생성
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();
		
		tv.turnOn();  // TV를 켭니다.
		tv.setVolume(12);  // 현재 볼륨: 10
		tv.turnOff();  // TV를 끕니다.
		tv.setMute(true);   // 무음처리합니다. 
		RemoteControl.changeBattery();  // 건전지를 교환합니다.   // 얘는 static이라서 이렇게
		tv.setMute(false);  // 무음 해제합니다.
		System.out.println("===============================");
		
		 
		audio.turnOn(); // Audio를 켭니다.
		audio.setVolume(-1);  // 현재 볼륨: 0
		audio.setMute(true);  // 무음처리합니다.
		audio.setMute(false);  // 무음 해제합니다.
		RemoteControl.changeBattery();  // 건전지를 교환합니다.
		audio.turnOff();  // Audio를 끕니다.
		
		
	}

}
