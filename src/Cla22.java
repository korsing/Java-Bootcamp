class Ani22 {
	void Cry() { System.out.println("Animal's Cry.."); }
}

class Dog22 extends Ani22 {
	void Cry() { System.out.println("Woof, Woof"); }
}

class Cat22 extends Ani22 {
	void Cry() { System.out.println("Morang Morang"); }
}

class Duck22 extends Ani22 {
	void Cry() { System.out.println("Quacks,"); }
}

public class Cla22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog22  d1 = new Dog22();
		Cat22  c1 = new Cat22();
		Duck22 k1 = new Duck22();
		
		d1.Cry(); c1.Cry(); k1.Cry(); // 일반적인 클래스 내 메서드 호술 방법
		System.out.println();
		
		Ani22[] aniArr = { d1, c1, k1 };
		for (Ani22 a : aniArr) {
			a.Cry();
		}
	}

}
