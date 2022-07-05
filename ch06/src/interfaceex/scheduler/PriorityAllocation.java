package interfaceex.scheduler;

public class PriorityAllocation implements scheduler{

	@Override
	public void getnextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 가져오기");
	}

	@Override
	public void sendCallAgent() {
		System.out.println("업무 SKILL이 높은 상담원에게 우선 배분하기");
	}

}
