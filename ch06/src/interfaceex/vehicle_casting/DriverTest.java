package interfaceex.vehicle_casting;

public class DriverTest {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		
		driver.drive(bus);  // 승차 요금을 체크합니다.
							// 버스가 달립니다.
	}

}
