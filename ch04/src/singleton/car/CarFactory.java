package singleton.car;

public class CarFactory {
	// 싱글톤패턴
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	
	
	// 차 생성
	public Car createCar() {
		Car car = new Car();    // 차 객체가 생성
		return car;
	}
}
