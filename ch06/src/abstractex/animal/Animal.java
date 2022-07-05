package abstractex.animal;

public abstract class Animal {
	
	//필드
	public String kind;  // 동물 종류
	
	
	
	//메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메서드
	public abstract void sound();    // 선언만 하구 구현부 {}는 없다
	
}
