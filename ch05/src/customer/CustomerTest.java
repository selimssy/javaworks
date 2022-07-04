package customer;

public class CustomerTest {

	public static void main(String[] args) {
		
		//Customer의 객체 생성
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("이순신");
		
		// 상품 구매
		int price = 10000;		
		customerLee.calcPrice(price);
		
		int price2 = 20000;
		customerLee.calcPrice(price2);
		
		
		
		
		// 고객 정보 출력
		System.out.println(customerLee.showCustomerInfo()); // 이순신님의 등급은 SILVER이며, 보너스 포인트는 300점 입니다.
		
		
	}

}
