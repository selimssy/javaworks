package taketrans;

public class Student {
	
	
	// 필드
	String name;   // 이름
	int money;     // 가진 돈
	
	
	// 생성자
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	
	// 차량에 탑승 메서드(매개변수의 다형성 이용)
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee);   // 요금냄
		this.money -= fee;    // 가진 돈에서 차감
	}
	
	
	
	// 정보
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원입니다.\n",name, money);
	}
	
	
	
}
