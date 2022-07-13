package banking;

import java.util.Scanner;

public class Main2 {
	// 배열의 크기가 100인 Account형 배역 선언
	private static Account[] accountArray = new Account[100];
	// 왜 여기만들지...ㅠ
	
	private static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		
		boolean run = true;    // 실행변수
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			
			String selectNo = sc.next();   // nextLine()은 자동 줄바꿈되는 경우가 있어서 next()사용!
			if(selectNo.equals("1")) {
				createAccount();                // 계좌생성
			}else if(selectNo.equals("2")) {
				accountList();                  // 계좌목록
			}else if(selectNo.equals("3")) {
				deposit();                      // 입금
			}else if(selectNo.equals("4")) { 
				withdraw();                     // 출금
			}else if(selectNo.equals("5")) {
				run = false;                   // 종료
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		
		}// while 닫기
		System.out.println("프로그램 종료");
	}



	private static void createAccount() {
		System.out.println("----------------------------------------");
		System.out.println("1.계좌생성");
		System.out.println("----------------------------------------");
		
		System.out.print("계좌 번호: ");
		String ano = sc.next();
		// 없는 계좌 입력하면 여기서 "계좌가 없습니다. 다시 입력하세요." 나오도록
				
		
		System.out.print("계좌주: ");
		String owner = sc.next();
		
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		
		// 계좌 객체 생성
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i] == null) {     // 배열의 공간이 null인 경우 계좌를 배열에 저장
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.(" + i + "번)");
				break;   // 계좌 생성하고 바로 for문 빠져나와야!
			}
		}
	}



	private static void accountList() {
		System.out.println("----------------------------------------");
		System.out.println("2.계좌 목록");
		System.out.println("----------------------------------------");
		
		for(int i=0; i < accountArray.length; i++) {
			Account account = accountArray[i];   // 배열에 저장된 account 대입
			if(account != null) {
				System.out.print("계좌 번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance() + "\t");
			}
			// 여기 System.out.println() 을 넣으면 배열 크기인 100줄 출력된 후에 끝난다ㅠ
		}
		
		
	}



	private static void deposit() {
		System.out.println("----------------------------------------");
		System.out.println("3.예금");
		System.out.println("----------------------------------------");
		
		// 입력한 계
		System.out.print("계좌 번호: ");
		String ano = sc.next();
		
		boolean run = true;
		while(run) {
			if(findAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시 입력하세요.");
				System.out.print("계좌번호: ");
				ano = sc.next();
			}else {
				run = false;
			}
		}
		
		// t꺼가 더 깔끔하다...		
		
		Account account = findAccount(ano);	  // 검색한 계좌의 account 반환(객체를 반환)
		
		System.out.print("입금액: ");	
		int money = sc.nextInt();
		
		while(true) {
			if(money < 0) {
				System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요.");
				System.out.print("입금액: ");	
				money = sc.nextInt();
			}else {
				break;
			}
		}
		
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 입금을 성공하였습니다. 잔액: " + account.getBalance() + "원");
	}
	
	
	
	
	/*private static void deposit() {
		try {
		System.out.println("----------------------------------------");
		System.out.println("3.예금");
		System.out.println("----------------------------------------");
		
		// 입력한 계
		System.out.print("계좌 번호: ");
		String ano = sc.next();
		
		Account account = findAccount(ano);	  // 검색한 계좌의 account 반환(객체를 반환)
		
		System.out.print("입금액: ");
		int money = sc.nextInt();
		
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 입금을 성공하였습니다. 잔액: " + account.getBalance() + "원");
		}catch(NullPointerException e){
			System.out.println("일치하는 계좌가 없습니다.");
		}
		
		}*/



	private static void withdraw() {
		System.out.println("----------------------------------------");
		System.out.println("4.출금");
		System.out.println("----------------------------------------");
		
		// 입력한 계
		System.out.print("계좌 번호: ");
		String ano = sc.next();
		
		boolean run = true;
		while(run) {
			if(findAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시 입력하세요.");
				System.out.print("계좌번호: ");
				ano = sc.next();
			}else {
				run = false;
			}
		}
		
		Account account = findAccount(ano);	
		
		System.out.print("출금액: ");
		int money = sc.nextInt();
		
		while(true) {
			if(money < 0) {
				System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요.");
				System.out.print("출금액: ");	
				money = sc.nextInt();
			}else if(account.getBalance() < money) {
				System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
				System.out.print("출금액: ");	
				money = sc.nextInt();
			}else {
				break;
			}
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금을 성공하였습니다. 잔액: " + account.getBalance() + "원");		
	}
	
	
	
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();   // 저장된 계좌를 가져와서
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}		
		}
		return account;
	}
	

}
