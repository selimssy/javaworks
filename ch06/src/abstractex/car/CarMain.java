package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		
		Car bus = new Bus();
		Car truck = new Truck();
		
		bus.run();  // 버스가 주행합니다.
		bus.refuel();  // 천연 가스를 충전합니다.
		bus.stop();   // 차가 멈춥니다.
		
		
		truck.run();     // 트럭이 주행합니다. 
		truck.refuel();  // 휘발유를 주유합니다.
		truck.stop();   // 차가 멈춥니다.
		
		
	}

}
