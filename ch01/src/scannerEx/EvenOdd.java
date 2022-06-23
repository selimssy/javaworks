package scannerEx;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 숫자를 입력받아 홀수 / 짝수 판별하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		
//		String result = (num % 2 == 1)? "홀수": "짝수";
		
		String result;
		
		if(num % 2 == 1) {
			result = "홀수";
		}
		else {
			result = "짝수";
		}
		
		System.out.println(result);
		
		
		sc.close();

	}

}
