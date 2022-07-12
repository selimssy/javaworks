package generic.printer;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		
		
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);		// 재료는 plastic입니다.
	
		
		
		
		// Powder 클래스 사용
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);   // 재료는 powder입니다.
		
		
		
	}
	

}
