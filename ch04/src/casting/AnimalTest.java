package casting;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}



class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}



class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 멀리 날아갑니다.");
	}
}



class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}




public class AnimalTest {
	
	public static ArrayList<Animal> animalList = new ArrayList<>();

	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		
		// 객체 생성
		// Animal animal = new Human();
		animalList.add(new Human());
		animalList.add(new Eagle());
		animalList.add(new Tiger());
		
		for(Animal i : animalList) {
			i.move();
		}
		
		
		
		System.out.println();
		System.out.println("========원래 형으로 다운캐스팅=======");

		aTest.testCasting();
		
		
	
		
		
	
		
	} // main 닫기
	
	
	// static이 없는 메서드는 객체를 생성해서 접근함
	
	public void testCasting() {
		for(int i = 0; i < animalList.size(); i++) {
			Animal obj = animalList.get(i);
			// intstanceof: 객체 여부를 확인해주는 연산자
			// 좌측의 타입으로 인해 우측이 만들어졌으면 true 반환/ 그외는 false    // 이거복습ㅠㅠ
			if(obj instanceof Human) {
				Human human = (Human)obj;   // 강제 타입 변환
				human.readBook();
			}else if(obj instanceof Eagle) {
				Eagle eagle = (Eagle)obj;
				eagle.flying();
			}else if(obj instanceof Tiger) {
				Tiger tiger = (Tiger)obj;
				tiger.hunting();
			}else {
				System.out.println("지원하지 않는 기능입니다.");
			}
		}
		
	}
	
	
}
