package poloymorphismex;

public class 스텐드  {
	private 전등 b;
	
	public void install(전등 b) {
		this.b = b;
	}
	
	public void on() {
		if(b != null)
		b.turnOn();
		else
			System.out.println("먼저 전구를 연결하세요.");
	}
	
	public void off() {
		if(b != null)
		b.turnOff();
		else
			System.out.println("먼저 전구를 연결하세요.");
	}
}
