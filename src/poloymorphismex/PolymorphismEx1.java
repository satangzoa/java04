package poloymorphismex;

public class PolymorphismEx1 {
	public static void main(String[] args) {
		백열등 b1 = new 백열등();
		스텐드 s1 = new 스텐드();
		s1.install(b1);
		s1.on();
		s1.off();
		
		
		형광등 b2 = new 형광등();
		s1.install(b2);
		s1.on();
		s1.off();
	}
}
