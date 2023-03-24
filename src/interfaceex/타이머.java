package interfaceex;


public class 타이머 {
	
	private 타이머사용자 callback;
	private int interval;

	public 타이머(int interval) {
		this.interval = interval;
	}
	
	public void setCallback(타이머사용자 callback) {
		this.callback = callback;
	}
	
	public void 시작() {
		for(int i = interval; i >0; i --) {
			System.out.println(i + "초 남았습니다...");//1초간 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			} 
		}
		
		System.out.println("시간이 되었습니다.😊😊");
		
		if(callback != null)
			callback.땡();
		
			}
}
