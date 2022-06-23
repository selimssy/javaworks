package loopevent;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		// 커피 자동판매기
		
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		int coffee = 5;
		
		while(true) {
			System.out.print("돈을 넣어주세요: ");
			money = sc.nextInt();
		
			if(money > 500){
				System.out.println("거스름돈이 나옵니다.");
				coffee -=1;
			}
			else if(money == 500) {
				System.out.println("커피가 나옵니다.");
				coffee -=1;
			}
			else{
				System.out.println("커피가 나오지 않습니다.");
			}
			
			System.out.println("남은 커피의 양은 " + coffee + "개입니다.");
			
			if(coffee == 0) {
				System.out.println("판매를 중단합니다.");
				break;
			}
			
		}
		
		sc.close();

	}

}
