package taketrans;

public class TakeTrans {

	public static void main(String[] args) {
		
		// 사람 객체 생성
		Student sohee = new Student("박소희", 10000);
		Student daeho = new Student("이대호", 20000);
		
		// 버스 객체 생성
		Bus bus100 = new Bus("bus100");
		
		// 택시 객채 생성
		Taxi kakaoTaxi = new Taxi("카카오택시");
		
		
		
		// 버스 타기
		sohee.take(bus100, 1200);
		daeho.take(bus100, 1200);
		
		// 택시 타기
		sohee.take(kakaoTaxi, 3800);
		daeho.take(kakaoTaxi, 5000);
		
		
		// 정보 출력
		sohee.showInfo();   // 박소희님의 남은 돈은 5,000원입니다.
		daeho.showInfo();   // 이대호님의 남은 돈은 13,800원입니다.
		bus100.showInfo();  // bus100의 수입은 2,400원이고, 승객수는 2명입니다.
		kakaoTaxi.showInfo();  // 카카오택시의 수입은 8,800원이고, 승객수는 2명입니다.
	}

}
