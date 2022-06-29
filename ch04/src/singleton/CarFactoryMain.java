package singleton;

public class CarFactoryMain {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car herSonata = factory.createCar();
		
		System.out.println("차 번호: " + mySonata.getCarNum());    // 차 번호: 10001
		System.out.println("차 번호: " + yourSonata.getCarNum());  // 차 번호: 10002
		System.out.println("차 번호: " + herSonata.getCarNum());  // 차 번호: 10003
	}

}
