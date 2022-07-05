package interfaceex.vehicle_casting;

public class VehicleTest {

	public static void main(String[] args) {
		
		
		Vehicle vehicle = new Bus();  // 자동 타입 변환

		
		vehicle.run();  // 자동타입으로 만들어서 부모꺼밖에 안뜬다
		// vehicle.checkFare(); 이거 안보인다!
		
		
		Bus bus1 = new Bus();   
		bus1.checkFare();     // 이렇게 직접 만들면 보인다
		 
		
		// 강제 티입 변환
		Bus bus = (Bus)vehicle;
		bus.run();             // 버스가 달립니다.
		bus.checkFare();       // 승차 요금을 체크합니다.
		 
	}

}
