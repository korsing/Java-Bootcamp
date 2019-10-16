abstract class Ani28 {
	String name;
	abstract void Cry();
}

class Dog28 extends Ani28 {
	
	void Cry() { System.out.println("�� : �۸�"); }
}

class Cat28 extends Ani28 {
	void Cry() { System.out.println("����� : �߿�"); }
}

class Duck28 extends Ani28 {
	void Cry() { System.out.println("���� : �в�"); }
}

public class Cla28 {

	public static void main(String[] args) {
		Ani28[] Animals = {new Dog28(), new Cat28(), new Duck28()};
		for (Ani28 Animal : Animals) {	Animal.Cry(); }
	}
	// �� : �۸�
	// ����� : �߿�
	// ���� : �в�
}


