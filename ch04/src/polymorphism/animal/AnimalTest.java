package polymorphism.animal;


class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}



class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}



class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}



class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}




public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		// 객체 생성
		Animal human = new Human();
		Animal Eagle = new Eagle();
		Animal Tiger = new Tiger();
		
		aTest.moveAnimal(human);    // 사람이 두 발로 걷습니다.
		aTest.moveAnimal(Eagle);	// 독수리가 하늘을 납니다.
		aTest.moveAnimal(Tiger); 	// 호랑이가 네 발로 뜁니다.
	}
	
	
	
	// 여긴 어떤 위치지ㅠ
	public void moveAnimal(Animal animal) {   // 매개변수의 다형성
		animal.move();
	}
	
	

}
