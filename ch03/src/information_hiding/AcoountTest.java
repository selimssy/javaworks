package information_hiding;

public class AcoountTest {

	public static void main(String[] args) {
		// Account 클래스의 객체 생성
		Account account = new Account();
		Account account2 = new Account("100-1235", "안산", 2000);
		
		
		// 필드에 직접 접근하지 못함(private)
//		account.ano = "100-1234";
		account.setAno("100-1234");
		account.setOwner("다이소");
		account.setBalance(1000);
		
		System.out.println("계좌번호: " + account.getAno());   // 계좌번호: 100-1234
		System.out.println("계좌주: " + account.getOwner());   // 계좌주: 다이소
		System.out.println("잔액: " + account.getbalance());   // 잔액: 1000
		
		
		
		// account2는 set() 필요없다
		System.out.println("계좌번호: " + account2.getAno());    // 계좌번호: 100-1235
		System.out.println("계좌번호: " + account2.getOwner());  //  계좌번호: 안산
		System.out.println("계좌번호: " + account2.getbalance());  // 계좌번호: 2000
	}

}
