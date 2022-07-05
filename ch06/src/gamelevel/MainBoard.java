package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		// 처음생성시 BeginnerLevel
		player.play(1);  // ***초보자 레벨입니다. ***  천천히 달립니다. jump 할 줄 모름 turn 할 줄 모름
	
	
		// 중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);  // *** 중급자 레벨입니다. *** 빨리 달립니다. (높이 jump합니다.)x2  turn 할 줄 모름
	
		
		// 고급자 레벨
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);   // *** 고급자 레벨입니다. *** 매우 빨리 달립니다. (매우 높이 jump합니다.)x3 한바퀴 돕니다.
	}

}
