package interfaceex.vehicle;

public class DriveTest {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		//Bus bus = new Bus();
		//Taxi taxi = new Taxi();
		
		
		
		// 인터페이스형 타입으로 객체 생성
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		
		
		
		driver.drive(bus);  // 버스가 달립니다.
		driver.drive(taxi);  // 택시가 달립니다.
		
		
		
		// 안에다가 직접 만드는 방법
		driver.drive(new Bus());  // 버스가 달립니다.
		driver.drive(new Taxi());  // 택시가 달립니다.
	}

}
