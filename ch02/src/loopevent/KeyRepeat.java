package loopevent;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// "y" - 계속반복, "n" - "반복 중단", 그 외의 키는 지원안함
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열 비교할 때 equals()사용,
		// 숫자 비교할 때는 == 사용!
		
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n) ");
			String key = sc.nextLine();    // char은 scan에서 지원하지 않는다
			
			if(key.equals("y")) { //문자열 비교할 때 key.equals()쓴다!  // string으로 받았으니까 쌍따로 해야!
				System.out.println("계속 반복");
				break;
			}
			else if(key.equals("n")) {
				System.out.println("반복 중단");
				break;
			}
			else {
				System.out.println("지원하지 않는 키입니다.");
			}
			
			}
		 sc.close();
		}
	}


