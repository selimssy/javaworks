package array;

public class ArrayExample1 {

	public static void main(String[] args) {
		// 배열의 선언과 사용
		
		// 변수를 사용 - 3명의 학생의 국어, 수학점수
//		int std1KorScore = 70;
//		int std2KorScore = 80;
//		int std3KorScore = 90;
//		
//		int std1MathScore = 80;
//		int std2MathScore = 90;
//		int std3MathScore = 100;
		
		
		
		// 배열을 이용하여 점수 저장
//		int[] KorScore = new int[3];
//		KorScore[0] = 70;
//		KorScore[1] = 80;
//		KorScore[2] = 90;
		
		// 선언과 동시에 초기화(중괄호쓴다)
//		int[] KorScore = new int[] {70, 80, 90};
		int[] KorScore = {70, 80, 90};

		
		System.out.println(KorScore.length + "개");   //3개
		
		
		
		// 특정한 데이터 조회(출력)
		System.out.println(KorScore[1]);   // 80
		
		
		// 수정, 변경
		KorScore[2] = 95;
		System.out.println(KorScore[2]);   // 95
		
		
		
		
		// 전체조회
		System.out.println(KorScore);    // 메모리주소 출력([I@394e1a0f)
		
		//전체 값을 출력하려면 for문 써야!
		for(int i = 0; i < KorScore.length; i++) {
//			System.out.println(KorScore[i]);
			System.out.print(KorScore[i] + " ");   // 70 80 95
		}
	}

}
