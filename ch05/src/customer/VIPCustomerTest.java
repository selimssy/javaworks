package customer;

public class VIPCustomerTest {

	public static void main(String[] args) {
		
		// VIP고객 객체 생성
		VipCustomer customerKing = new VipCustomer();
		
		customerKing.setCustomerName("세종대왕");
		customerKing.setAgentID(1446);
		
		// 상품 구매
		int price = 10000;
		customerKing.calcPrice(price);  
		
		int price2 = 10000;
		customerKing.calcPrice(price2);  
		
		
		System.out.println(customerKing.showCustomerInfo());
	}

}
