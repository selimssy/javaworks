package customer;

public class VipCustomer extends Customer {
	// 필드
	private int agentID;   // 담당상담원  ID
	private double saleRatio;  // 구매 할인율
	
	
	// 생성자
	public VipCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;   // 5%
		saleRatio = 0.1;   // 10%
	}
	
	
	// 매개변수 있는 생성자
		public VipCustomer(int customerID, String customerName, int agentID) {
			super(customerID, customerName);   // 부모꺼는 이렇게
			this.agentID = agentID;   // 자기꺼는 이렇게
			customerGrade = "VIP";
			bonusRatio = 0.05;   // 5%
			saleRatio = 0.1;   // 10%
		}
	
	
	
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID; 
	}

	
	// 가격 계산 재정의
	@Override
	public int calcPrice(int price) {
		// 가격 = 가격 - (가격 * 구미할인율)
		// price = price - (int)(price * saleRatio);
		price -=(int)(price * saleRatio);
		bonusPoint +=(int)(price * bonusRatio);
		return price;
	}

	
	// 고객 정보 재정의
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n담당 상담원 아이디는 "
				+ agentID + "입니다.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
