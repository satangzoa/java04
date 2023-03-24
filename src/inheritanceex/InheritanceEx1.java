package inheritanceex;

public class InheritanceEx1 {
	public static void main(String[] args) {
		B b1 = new B();
		// 부모가 멤버를 그대로 사용할 수 있음
		b1.v1 = 10;
		b1.m1();
		//자신의 맴버도 사용
		b1.v1  = 20;
		b1.m2(); 
		
	}
}

class A {
	int v1;
	void m1() {}
}

class B extends A {
	int v2;
	void m2() {}
}
