package interfaceex;

public class TimerTest {
	public static void main(String[] args) {
		타이머 t1 = new 타이머(10);
		t1.setCallback(new MyWork());
		t1.시작();
		
		t1.setCallback(new 폭탄테러범());
		t1.시작();
	}
}

class MyWork implements 타이머사용자 {

	@Override
	public void 땡() {

		System.out.println("가스불을 끕니다. 라면이 다 익었습니당");
	}
	
}


class 폭탄테러범 implements 타이머사용자 {

	@Override
	public void 땡() {

		System.out.println("시한폭탄이 터집니다!!!!");
	}
	
}
