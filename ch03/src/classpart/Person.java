package classpart;

public class Person {
	//필드
	String name;
	float height;
	float weight;
	
	// 생성자 오버로딩: 이름이 같고 매개변수나 자료형이 다른 것(매개변수 있고 없는거면 이름 같아도 다른 함수다)
	
	// 기본생성자
	public Person(){
		System.out.println("사람을 생성합니다");
	}       // 매개변수가 있는 생성자들까지 같이 사용할꺼면 생략하면 안된다!!★
	
	
	// 매개변수가 있는 생성자   
	public Person(String n) {  // 이름을 외보에서 매개변수로 받는다    
		name = n; 
	}      
	
	
	public Person(String n, float h, float w) {  // 이런걸 제일 많이쓴다
		name = n;
		height = h;
		weight = w;
	}
	
	
	
	// 메서드
	public void showInfo() {
		System.out.println("이름: " + name + ", 키: " + height 
				+ ", 몸무게: " + weight);
	}
}
