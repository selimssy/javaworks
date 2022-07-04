package exer;

public class FinalEx_USING {

	public static void main(String[] args) {
		System.out.println(FinalEx_Define.GOOD_MORNING);
		System.out.println("최솟값은 " + FinalEx_Define.MIN);
		System.out.println("최댓값은 " + FinalEx_Define.MAX);
		System.out.println("수학 과목 코드값은 " + FinalEx_Define.MATH + "입니다.");
		System.out.println("영어 과목 코드값은 " + FinalEx_Define.ENG + "입니다.");
		
	}
	
	
	
	// final 없는 메소드
	public void speed() {
		System.out.println("재정의 가능");
	}
	
	
	//final 메소드
	public final void stop() {
		System.out.println("재정의 불가");
	}
	
	
}
