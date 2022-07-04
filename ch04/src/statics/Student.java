package statics;

public class Student {
	
	// 필드나 메소드를 생성 시 인스턴스로 생성할것인지 정적으로 생성할것인지에 대한 판단 기준은 
	// 공용으로 사용하느냐 아니냐로 내리면 됩니다. 
	static int serialNum = 100; // 기준 번호
	int id;  // 학번
	String name;  // 이름
	
	// 생성자
	public Student() {}
	
	
	// 이름을 생성하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	
	// 이름을 가져오는 메서드
	public String getName() {
		return name;
	}
}
