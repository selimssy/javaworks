package abstractex.animal;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();        // 멍멍!
		
		Cat cat = new Cat();
		cat.sound();        // 야~옹
		
		
		
		// 자동 형변환
		//Animal animal = new Dog();     // Animal이 추상클래스더라도 이거는 된다! Dog()가 생기니까
		
		Animal animal = null;  // 객체초기화는 null!
		animal = new Dog();
		animal.sound();     // 멍멍!
		
		animal = new Cat();
		animal.sound();     // 야~옹
		
		System.out.println("==========================");
		
		
		
		
		// 메소드의 매개 변수의 다형성
		animalSound(dog);   // 멍멍!
		animalSound(cat);   // 야~옹
		
		
	}// main 닫기

	private static void animalSound(Animal animal) {
		animal.sound();
	}

}
