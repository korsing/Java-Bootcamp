abstract class abAni27 {
	void cry() { System.out.println("Cry Cry"); }
	void run() { System.out.println("Run"); }
	abstract void shout();
}

class Dog27 extends abAni27 {
	void cry () { System.out.println("Cry Dog!"); }
	void run () { System.out.println("Run Dog!"); }
	void shout () { System.out.println("Shout Dog!"); }
}
public class Cla27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// abAni27 a1 = new abAni27(); 추상 클래스는 생성이 안되네
		Dog27 d1 = new Dog27();
		d1.shout();
		d1.run();
		d1.cry();
	}

}
