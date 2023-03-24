package staticex;

public class StaticEx2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		System.out.println(c1.serialNo);
		System.out.println(c2.serialNo);
		System.out.println(c3.serialNo);
	}
}

class Car {
	String serialNo;
	static int nextNo; // 모든 객체가 함께 이용하는 공유변수
	
	Car() {
		serialNo = "Car" + ++nextNo;
		
	}
}
