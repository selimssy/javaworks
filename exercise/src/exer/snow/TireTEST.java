package exer.snow;

public class TireTEST {

	public static void main(String[] args) {
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();   // 스노우 타이어
		tire.run();   // 스노우 타이어
		
		System.out.println(snowTire);  // exer.snow.SnowTire@1d29cf23
		System.out.println(tire);   // exer.snow.SnowTire@1d29cf23
		// 둘이 같다!!
	}

}
