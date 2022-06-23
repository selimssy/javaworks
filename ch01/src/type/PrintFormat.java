package type;

public class PrintFormat {

	public static void main(String[] args) {
		// 서식 문자
		// 이스케이프 문자
		
		int year = 2022;
		System.out.printf("올해는 %d년입니다.\n", year);   // 올해는 2022년입니다.
		
		float weight = 63.7F;
		System.out.printf("그의 몸무게는 %.2fkg입니다.\n", weight);   // 그의 몸무게는 63.70kg입니다.
	
		String nick = "얼음 공주";
		System.out.printf("그녀의 별명은 %s입니다. \n", nick);   // 그녀의 별명은 얼음 공주입니다. 
		
		
		
		//표
//		System.out.println("-----------------------------");
//		System.out.println("이름\t나이\t나라");
//		System.out.println("강감찬\t82\t고려");
//		System.out.println("이순신\t53\t조선");
//		System.out.println("-----------------------------");
		
		String table = "";
		table += "--------------------------\n";
		table += "이름\t나이\t나라\n";
		table += "강감찬\t82\t고려\n";
		table += "이순신\t53\t조선\n";
		table += "-----------------------------";
		System.out.println(table);
		
		
		
	}

}
