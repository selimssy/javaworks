package type;

import java.util.Scanner;

public class BooleanExample {

	public static void main(String[] args) {
		
		boolean stop = false;
		
		if(stop) {   // if(stop == true)
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean run  = true;
		
		int money = 0;
		int balance = 0;
		
		while(run) {
			System.out.print("메뉴를 선택해주세요. 1:입금 / 2:출금 / 3:잔액조회 / 4:종료");
			int select = sc.nextInt();
			if(select == 1) {
				while(true) {
					System.out.print("입금할 금액을 입력해주세요.");
					money = sc.nextInt();
					if(money < 0) {
						System.out.println("음수는 입력할 수 없습니다.");
					}
					else {
						balance += money;
						System.out.println("입금이 완료되었습니다.");
						break;					
					}
				}
			}
			else if(select == 2){
				while(true) {
					System.out.print("출금할 금액을 읿력해주세요.");
					money = sc.nextInt();
					if(money < 0) {
						System.out.println("음수는 입력할 수 없습니다.");
					}
					else if(money > balance) {
						System.out.println("잔액이 부족합니다.");
					}
					else {
						balance -= money;
						System.out.println("출금이 완료되었습니다.");
						break;
					}
				}
			}
			else if(select == 3) {
				System.out.println("잔액 조회입니다.");
				System.out.println("잔액은 " + balance + "원입니다.");
			}
			
			else if(select == 4) {
				System.out.println("이용해주셔서 감사합니다.");
				run = false;
				break;
			}
		}
		
		
		sc.close();
			

	}

}
