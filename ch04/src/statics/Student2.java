package statics;

public class Student2 {
	
	private static int serialNum = 100; // 기준 번호   
	// static을 넣어줘야 serialNum++가 먹힌다!
	private int id;  // 학번
	private String name;  // 이름
	
	// 생성자
	public Student2() {
		serialNum++;
		id = serialNum;
	}
	
	
	// id 설정하는 메서드
	public void setId(int id) {
		this.id = id;
	}
	
	
	// id 출력하는 메서드
	public int getId() {
		return id;
	}
	
	
	// 이름을 생성하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	
	// 이름을 가져오는 메서드
	public String getName() {
		return name;
	}
}
