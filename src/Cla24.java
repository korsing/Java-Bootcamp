
class A24 { }
class B24 extends A24 { }
class C24 extends A24 { }
class D24 extends B24 { }
class E24 extends C24 { }

public class Cla24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B24 b = new B24(); 
		C24 c = new C24();
		D24 d = new D24();
		E24 e = new E24();
		
		A24 a1 = b; // B가 A를 상속하고 있으니, 당연히 B 객체를 A형으로 선언할 수 있다.
		A24 a2 = c; // C가 A를 상속하고 있으니, 당연히 C 객체를 A형으로 선언할 수 있다.
		A24 a3 = d; // D가 A를 상속하고 있으니, 당연히 D 객체를 A형으로 선언할 수 있다.
		A24 a4 = e;
		
		System.out.println( b instanceof D24 ); // false
		
		
		
		
		System.out.println ("Execution Completed.");
		
	}

}
