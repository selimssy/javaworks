package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		// 두 인스턴스가 같은 주소인지 확인(주소 비교할때 == 사용)
		// 인스턴스는 같은 주소! 즉 1개로 간주할 수 있다
		System.out.println(myCompany1);
		System.out.println(myCompany2);

	}

}
