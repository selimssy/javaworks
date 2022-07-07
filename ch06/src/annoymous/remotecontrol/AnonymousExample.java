package annoymous.remotecontrol;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous annoy = new Anonymous();
		
		//익명 객체 필드 사용
		annoy.field.turnOn();   // TV를 켭니다.
		
		
		// 익명 객체 로컬 변수 사용
		annoy.method1();   // Audio를 켭니다.
		
		
		
		// 익명 객체 매개값 사용
		annoy.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
				
			}                                               // SmartTV를 켭니다.
			
		});
		
	}

}
