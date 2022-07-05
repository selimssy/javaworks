package tire;

public class CarExample {

	public static void main(String[] args) {
		 
		Car car = new Car();     // car 객체 생성
		
		for(int i=1; i <=7; i++) {
			int problemLocation = car.run();   //  car 객채의 run()메소드 7번 반복 실행
		
		
		
		
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.frontLeftTire = new HankookTire("앞왼쪽", 15);  // 앞왼쪽 타이어가 펑크났을 때 HankookTire로 교체
			break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			car.frontRightTire = new KumhoTire("앞오른쪽", 13);  // 앞오른쪽 타이어가 펑크났을 때 KumhoTire로 교체
			break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체");
			car.backLeftTire = new HankookTire("뒤왼쪽", 14);  // 뒤왼쪽 타이어가 펑크났을 때 HankookTire로 교체
			break;
		case 4:
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			car.backRightTire = new KumhoTire("뒤오른쪽", 17);  // 뒤오른쪽 타이어가 펑크났을 때 KumhoTire로 교체
			break;		
		}
		
		System.out.println("-------------------------");   // 1회전 시 출력되는 내용을 구분
		
		}
	}

}
