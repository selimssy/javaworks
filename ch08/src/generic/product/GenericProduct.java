package generic.product;

public class GenericProduct {

	public static void main(String[] args) {
		
		// <클래스, 문자열> 타입
		Product<TV, String> prod1 = new Product<>();
		TV tv = new TV();
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		tv.making();   // 회사가 TV를 제조합니다.
		System.out.println("모델: " + prod1.getModel());  // 모델: 스마트TV
		
		
		
		
		
		// <클래스, 문자열> 타입
		Product<Car, String> prod2 = new Product<>();
		Car car = new Car();
		prod2.setKind(car);
		prod2.setModel("전기차");
		car.making();   // 회사가 자동차를 제조합니다.
		System.out.println("모델: " + prod2.getModel());   // 모델: 전기차
		
		
	}

}
