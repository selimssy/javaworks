package scorearray;

public class ScoreExample {

	public static void main(String[] args) {
		// 5명의 자바 과목 점수
		int[] score = {80, 90, 74, 100, 50};
		int sumV = 0;
		double avgV = 0.0;    // 타입이랑 0.0으로 초기화하는거 주의ㅠ 
		int maxV; // 밑에서 초기화할거라서 여기서 안해도 된다/ 근데 헷갈리면 다 해도 된다
		int minV;
		
		// 총점
		for(int i = 0; i < score.length; i++) {
			sumV += score[i];
		}
		System.out.println("총점: " + sumV);   // 390
		
		// 평균 
		avgV = (double)sumV / score.length;    // 오른쪽은 기본으로 int로 계산되서 double로 형변환해줘야!(저렇게 한쪽만 해주면 되나보당)
		System.out.println("평균: " + avgV);
		
		// 최고점수
		maxV = score[0];
		for(int i = 1; i < score.length; i++) {
			if(maxV < score[i]) {
				maxV = score[i];
			}
		}		
		System.out.println("최고점수: " + maxV);   // 100
		
		
		
		// 최저점수
		minV = score[0];
		for(int i = 1; i < score.length; i++) {
			if(minV > score[i]) {
				minV = score[i];
			}
		}
		System.out.println("최저점수: " + minV);   // 50
		
	}

}
