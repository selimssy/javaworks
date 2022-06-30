package exer;

import java.util.Scanner;

public class P160 {

	public static void main(String[] args) {
		
		// 2. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합 구하는 코드

		int sumV = 0;
		for(int i = 1; i <= 100; i++) {		
			if(i % 3 == 0) {
				sumV += i;
			}
		}
		System.out.println(sumV);
		
		
		
		
		
		
		// 3.주사위 2개를 (눈1, 눈2) 형태로 출력하고 두 수의 합이 5면 실행종료
		while(true) {
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if(num1 + num2 == 5) {
				break;
			}
		}
		
		
		
		
		System.out.println("=========================================");
		
		
		// 4. 4x + 5y = 60 의 해 구하기(x y는 10 이하의 자연수)
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		
		
		
		System.out.println("=========================================");
		
		
		// 5.
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("=========================================");
		
		// 6.
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <=4-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		System.out.println("다른방법");
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <=4; j++) {
				if(j < 5-i) {
					System.out.print(" ");
				}else {  // j >= i
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("=========================================");
		
		
		//7. 
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int money = 0;
		int balance = 0;
		
		while(run) {
			try {
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.print("선택: ");
				int selectNum = sc.nextInt();
				if(selectNum == 1) {
					while(true) {
						System.out.print("입금할 금액을 입력하세요.");
						money = sc.nextInt();
						if(money < 0) {
							System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요.");
						}else {
							balance += money;
							System.out.println("입금이 완료되었습니다. 잔액은 " + balance + "원입니다.");
							break;
						}
					}
				}
				else if(selectNum == 2) {
					while(true) {
						System.out.print("출금할 금액을 입력해주세요.");
						money = sc.nextInt();
						if(money < 0) {
							System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요.");
						}
						else if(money > balance) {
							System.out.println("잔액이 부족합니다.");
						}
						else {
							balance -= money;
							System.out.println("출금이 완료되었습니다. 잔액은 " + balance + "원입니다.");
							break;
						}
					}
				}
				else if(selectNum == 3) {
					System.out.println("잔액은 " + balance + "원입니다.");
				}
				else if(selectNum == 4) {
					System.out.println("이용해주셔서 감사합니다.");
					run = false;
				}
				else {
					System.out.println("지원되지 않는 기능입니다.");
				}
			}catch(Exception e) {System.out.println("올바른 선택이 압니다. 다시 선택하세요.");}
		}
		
		System.out.println("프로그램 종료!");
		

	}

}
