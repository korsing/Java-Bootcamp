
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
		
		A24 a1 = b; // B�� A�� ����ϰ� ������, �翬�� B ��ü�� A������ ������ �� �ִ�.
		A24 a2 = c; // C�� A�� ����ϰ� ������, �翬�� C ��ü�� A������ ������ �� �ִ�.
		A24 a3 = d; // D�� A�� ����ϰ� ������, �翬�� D ��ü�� A������ ������ �� �ִ�.
		A24 a4 = e;
		
		System.out.println( b instanceof D24 ); // false
		
		
		
		
		System.out.println ("Execution Completed.");
		
	}

}
