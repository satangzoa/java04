package inheritanceex3;

public class InheritanceEx3 {
	public static void main(String[] args) {
		학생 s1 = new 학생("나학생");
		s1.study();
	
		학생 s2 = new 초등학생("김초롱");
//		s2.study();
		doStudy(s2);

		학생 s3 = new 대학생("이학사");
//		s3.study();
		doStudy(s3);
	}

	static void doStudy(학생 s) {
		s.study();
	}
	
//	 다형성을 적용하면 하나의 메서드로 통합된다
//	static void doStudy(초등학생 s) {
//		s.study();
//	}
//	
//	static void doStudy(대학생 s) {
//		s.study();
//	}
}

class 사람 {
	
}

class 학생  extends 사람 {
	학생() { } //파라미터가 없는 생성자
	학생(String name) { //매서드
		this.name = name;
	}
	
	
	String name;
	
	void study() {
		System.out.println(name + " 학생이 공부합니다.");
	}
}

class 초등학생  extends 학생{
	// 부모의 생성자는 상속되지 않는다. 자식에서 별도로 추가해야함.
	초등학생() {}
	초등학생(String name) {
		this.name = name;
	}
	
	// 부모의 메서드를 자식에서 재정의한다.
	void study() { //오버라이딩
		System.out.println(name + " 초등학생이 과외선생님과 공부합니다.");
	}
}

class 대학생 extends 학생 {
	// 부모의 생성자는 상속되지 않는다. 자식에서 별도로 추가해야함.
		대학생() {}
		대학생(String name) {
			this.name = name;
		}
	void study() {
		System.out.println(name + " 대학생이 도서관에서 공부합니다.");
	}
}








