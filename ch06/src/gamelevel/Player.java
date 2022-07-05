package gamelevel;

public class Player {
	
	// 필드
	private PlayerLevel level;
	
	
	// 생성자 = 초보자로 생성됨
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	
	
	// 레벨 세팅하는 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	
	
	// 템플릿 메서드 go 호출하는 메서드
	public void play(int count) {
		level.go(count);
	}
	
	
	
	
}
