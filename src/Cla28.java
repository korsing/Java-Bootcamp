abstract class Ani28 {
	String name;
	abstract void Cry();
}

class Dog28 extends Ani28 {
	
	void Cry() { System.out.println("俺 : 港港"); }
}

class Cat28 extends Ani28 {
	void Cry() { System.out.println("绊剧捞 : 具克"); }
}

class Duck28 extends Ani28 {
	void Cry() { System.out.println("坷府 : 残残"); }
}

public class Cla28 {

	public static void main(String[] args) {
		Ani28[] Animals = {new Dog28(), new Cat28(), new Duck28()};
		for (Ani28 Animal : Animals) {	Animal.Cry(); }
	}
	// 俺 : 港港
	// 绊剧捞 : 具克
	// 坷府 : 残残
}


