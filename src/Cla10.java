class A10 {
	int aa1 = 10;            // Default : 같은 패키지
	public int aa2 = 100;    // Public : 항상 공개
	private int aa3 = 100;   // Private : 현재 A10 클래스 내부에서만 사용
	protected int aa4 = 100; // Protected : 상속 받은 클래스끼리는 공유
	
	A10() { System.out.println ("A10 Constructor Call.."); }
	// B10에서 A10을 상속받아가면 생성자는 자동으로 호출이 된다.
}

class B10 extends A10 {
	int bb1 = 20;
	B10() { System.out.println ("B10 Constructor Call.."); }
}

public class Cla10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B10 b1 = new B10();
		System.out.println(b1.aa1); // 부모 클래스에서 선언된 변수도 호출이 가능함.
	}

}
