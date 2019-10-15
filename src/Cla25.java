class A25 {
	final int a;
	A25( int a ) { this.a = a; }
	static final int b = 777;
}

final class B25 extends A25 {
	B25( int a ) { super(a); }
}
public class Cla25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A25 a1 = new A25(25);
		System.out.println(a1.a);
	}
}
