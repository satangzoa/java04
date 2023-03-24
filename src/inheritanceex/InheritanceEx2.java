package inheritanceex;


public class InheritanceEx2 {
	
}


// 중복된 멤버를 부모 클래스 안에 작성
class 학생 {
	String studentNo;
	String name;
	int age;

	public 학생() {
	}

	public 학생(String studentNo, String name, int age) {
		this.studentNo = studentNo;
		this.name = name;
		this.age = age;
	}
	
}

class 초등학생 extends 학생 {
	public 초등학생() {
		
	}
	
	public 초등학생(String studentNo, String name, int age, String 특별활동반) {
//		부모생성자를 이용해 초기화
		super(studentNo, name, age);
		this.특별활동반 = 특별활동반;
	}

	String 특별활동반;
}

class 대학생 extends 학생 {

	public 대학생() {
	}

	
	public 대학생(String studentNo, String name, int age,	String 학과 ) {
		super(studentNo, name, age);
		this.학과 = 학과;
	}


	String 학과;
}



