package object;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {       // 매개값이 Member 타입인지 확인
			Member member = (Member) obj;   // Member 타입으로 강제 타입 변환하고 id 필드값이 동일한지 검사한 후 동일하면 true 반환
			if(id.equals(obj)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
