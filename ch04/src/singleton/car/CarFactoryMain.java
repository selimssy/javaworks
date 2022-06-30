package singleton.car;

public class CarFactoryMain {

	public static void main(String[] args) {
		//공장 객체 1개 생성
		CarFactory factory = CarFactory.getInstance();
		
		//공장에서 차를 생산
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car herSonata = factory.createCar();
		
		System.out.println("차 번호: " + mySonata.getCarNum());    // 차 번호: 10001
		System.out.println("차 번호: " + yourSonata.getCarNum());  // 차 번호: 10002
		System.out.println("차 번호: " + herSonata.getCarNum());  // 차 번호: 10003
	}

}
