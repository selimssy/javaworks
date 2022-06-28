package builtinclass;

public class MathrandomEx {

	public static void main(String[] args) {
		System.out.println("주사위 10번 던지기");
		for(int i = 1; i <= 10; i++) {
			int dice = (int)(Math.random() * 6) + 1;
			System.out.print(dice + " ");
		}
		
		
		
		System.out.println("문자열 랜덤 출력");
		String[] word = {"나", "너", "우리", "우주", "세계"};
		int randnum = (int)(Math.random() * word.length);     // 배열 인덱스는 0부터 시작하니까 +1 하면 안된다!!★(숫자를 몇부터 몇까지 만들어야 되는지 먼저 생각해야)
		System.out.println(word[randnum]);
	}

}
