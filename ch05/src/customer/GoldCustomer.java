package customer;

public class GoldCustomer extends Customer{
	
	// 필드
	private double saleRatio;   // 구매 할인율
	
	//생성자
	public GoldCustomer() {
		customerGrade = "GOLD";
		bonusRatio = 0.02;   // 2%
		saleRatio = 0.1;
	}
	
	
	
	//매개변수 있는 생성자
		public GoldCustomer(int customerID, String customerName) {
			super(customerID, customerName);
			customerGrade = "GOLD";
			bonusRatio = 0.02;   // 2%
			saleRatio = 0.1;
		}



	@Override
	public int calcPrice(int price) {
		// 가격 = 가격 - (가격 * 구미할인율)
		// price = price - (int)(price * saleRatio);
		price -=(int)(price * saleRatio);
		bonusPoint +=(int)(price * bonusRatio);
		return price;
	}
	
}
