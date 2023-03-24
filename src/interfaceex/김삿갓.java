package interfaceex;

public class 김삿갓 implements 손님, 직원{
	
	@Override
	public void 지불하다() {
		System.out.println("김삿갓이 15000원을 지불합니다.");
	}

	@Override
	public void 주문하다() {
		System.out.println("김삿갓이 탕슉을 주문합니다.");
	}

	@Override
	public void 출근하다() {
		System.out.println("김삿갓이 지하철을 타고 출근합니다.");
	}

	@Override
	public void 퇴근하다() {
		System.out.println("김삿갓이 지하철을 타고 퇴근합니다.");
		
	}
}
