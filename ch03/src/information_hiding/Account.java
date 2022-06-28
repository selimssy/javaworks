package information_hiding;

public class Account {
	//필드
	private String ano;    // 계좌번호
	private String owner;   // 계좌주
	private int balance;   // 잔액
	
	
	
	public Account(){}
	
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;    
	}
	
	
	// set + 필드이름()
	void setAno(String ano) {  // 외부 입력매개변수와 필드 이름을 같게
		this.ano = ano;    // 필드쪽에 this 붙인다!
	}
	
	void setOwner(String owner) { 
		this.owner = owner;    
	}
	
	void setBalance(int balance) { 
		this.balance = balance;    
	}
	
	// get + 필드이름()
	public String getAno() {
		return ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getbalance() {
		return balance;
	}
	
}
