package interfaceex;

public class 홍길동 implements 손님{ //홍길동을 Ctrl + 1 

	@Override
	public void 지불하다() {
		System.out.println("홍길동이 10000원을 지불합니다.");
	}

	@Override
	public void 주문하다() {
		System.out.println("홍길동이 짬뽕을 주문합니다.");
	}

}
