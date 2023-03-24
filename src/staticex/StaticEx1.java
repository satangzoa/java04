package staticex;

public class StaticEx1 {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		System.out.println(mc1.add(10, 20));
		
		//static 메서드는 클래스 이름으로 접근
		System.out.println(MyClass.minus(50, 10));
	
		mc1.v1 = 10;
		
		//static 변수도 클래스 이름으로 접근
		MyClass.v2 = 20;
	
	}
	
}

class MyClass {
	int v1;
	static int v2;
	
	
	int add(int a, int b) {
		return a + b;
	}
	
	static int minus(int a, int b) { //완성된 메소드
//		static 메서드는 static 멤버만 사용할 수 있음
//		v1 = 0;
//		add(10, 20);
		return a - b;
	}
	
}
