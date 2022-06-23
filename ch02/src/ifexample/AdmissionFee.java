package ifexample;

public class AdmissionFee {

	public static void main(String[] args) {
		
		int age = 17;
		String classify = "";
		int fee = 0;
				
		if(age < 8) {
			classify = "취학전 아동";
			fee = 1000;
		}
		else if(age < 14) {
			classify = "초등학생";
			fee = 2000;
		}
		else if(age < 20) {
			classify = "중/고등학생";
			fee = 2500;
		}
		else {
			classify = "일반인";
			fee = 3000;
		}
		
        System.out.printf("%s입니다.\n입장료는 %,d원입니다.", classify, fee);
		

	}

}
