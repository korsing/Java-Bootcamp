
public class Cla15 {
	static int a = 15;
	       int b = 25;
	       
	static void c() { System.out.println ("Hi"); }
	       void d() { System.out.println ("Hi"); }
	       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		// System.out.println (b); Static 영역에서는 instance 변수 및 함수를 호출할 수 없다.
		c();
		// d();
	}

}
