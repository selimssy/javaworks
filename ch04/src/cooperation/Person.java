package cooperation;

public class Person {
	
	//필드
	String name;   // 이름
	int money;     // 가진 돈
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	// 버스를 타다 메서드
	public void takeBus(Bus bus) {
		bus.take(1200);   // Bus 클래스 객체에 있는 take
		this.money -= 1200;
	}
	
	
	// 지하철 타다 메서드
	public void takeSubway(Subway subway) {
		subway.take(1500);   // Bus 클래스 객체에 있는 take
		this.money -= 1500;
	}
	
	
	// 사람의 정보
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원입니다.");
	}
	
	
	
	
}
