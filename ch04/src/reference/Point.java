package reference;

public class Point {
	// 점 클래스
	
	// 필드
	int x;
	int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	//메서드
	public void showInfo() {
		System.out.println("점(" + x + ", " + y + ")");
	}
}
