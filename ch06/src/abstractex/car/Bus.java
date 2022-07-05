package abstractex.car;

public class Bus extends Car{
	
	
	//얘꺼 메서드
	public void takePassenger() {
		System.out.println("버스에 승객을 태웁니다.");
	}
	
	

	
	// Car의 추상메서드 구현
	@Override
	public void run() {
		System.out.println("버스가 주행합니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전합니다.");
	}

}
