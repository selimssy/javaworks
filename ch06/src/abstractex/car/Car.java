package abstractex.car;

public abstract class Car {
	
	public abstract void run();    // 추상 메서드 만드려면 abstract 붙여야!
	
	public abstract void refuel();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
}
