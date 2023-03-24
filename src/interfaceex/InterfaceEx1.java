package interfaceex;

public class InterfaceEx1 {
	public static void main(String[] args) {
		홍길동 p1 = new 홍길동();
		김삿갓 p2 = new 김삿갓();
		
		식당(p1);
		식당(p2);
		
		//홍길동은 직원 호칭을 갖고 있지 않음
//		회사업무(p1);
		
		회사업무(p2);
	}
	
	static void 식당(손님  c) {
		c.주문하다();
		c.지불하다();
	}
	
	static void 회사업무(직원 e) {
		e.출근하다();
		e.퇴근하다();
	}
}
