package interfaceex.scheduler;

public class LeastJob implements scheduler{

	@Override
	public void getnextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져오기");
	}

	@Override
	public void sendCallAgent() {
		System.out.println("현재 상담업부가 없거나 대기가 가장 적은 상담원에게 배분");
	}

}
