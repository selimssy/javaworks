package scorearray;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		boolean run = true;   // 실행 변수
		int studentNum = 0;  // 학생수(배열의 크기)
		int[] scores = null;  // 점수 배열, 객체초기화는 null로 한다
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			try {
				System.out.println("----------------------------------------------");
				System.out.println("1.학생수 | 2.점수 입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("----------------------------------------------");
				System.out.print("선택>");
				
				int selectNo = Integer.parseInt(sc.nextLine());  // 문자를 정수로 변환
				
				if(selectNo == 1) {
					System.out.print("학생수>");
					studentNum = Integer.parseInt(sc.nextLine());  // 학생수
					scores = new int[studentNum];  // 학생수를 배열 크기로  복습ㅠ
				}
				else if(selectNo == 2) {
					for(int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]: ");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
				}
				else if(selectNo == 3) {
					for(int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]: " + scores[i]);					
					}
				}
				
				else if(selectNo == 4) {
					int sumV = 0;
					double avgV = 0.0;
					int maxV = scores[0];  // 그냥 0번 인덱스로 바로 초기화
					
					//총점
					for(int i = 0; i < scores.length; i++) {
						sumV += scores[i];
					}
					// System.out.println("총점: " + sumV);
					
					// 평균
					avgV = (double)sumV / scores.length;
					System.out.printf("평균 점수: %.2f", avgV);
					
					//최고 점수
					for(int i = 1; i < scores.length; i++) {
						if(maxV < scores[i])
							maxV = scores[i];
					}
					System.out.println("최고 점수: " + maxV);
					
				}		
				
				else if(selectNo == 5) {
					run = false;
				}
				
				else {  // 다른 번호 눌렀을 때
					System.out.println("지원되지 않는 기능입니다. 다시 선택하세요.");
				}
			}catch(Exception e) {   // try catch 하기 전에는 한글 넣으면 다운됐었다!
									// while 시작부터 else 끝난곳까지 try로 묶고 그 뒤에 catch
				System.out.println("올바르게 선택해주세요");
			}
		} //while 닫기
		System.out.println("프로그램 종료!");
		
		sc.close();
	}

}
