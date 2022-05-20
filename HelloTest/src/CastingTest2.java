
public class CastingTest2 {

	public static void main(String[] args) {
		
		//upCasting
		A a1 = new C();
		B b1 = new C();
		C c1 = new C();
		
		A a2 = new B();
		B b2 = new B();

		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(c1.toString());
		
		//downCasting
		B b = new C();
		C c2 = (C)b;
		System.out.println(c2.toString());

	}

}
