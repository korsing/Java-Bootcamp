
/*
 * Final ���� : ���� ���� (���ȭ)
 * Final �Լ� : �����ε�, �������̵� ����
 * Final Ŭ���� : ��� ����
 */

class Animal17 { // object ��ü�� �ڵ����� ����ϴ� ��
	String name = "Animal's Name";
	int age;
	void cry () {
		System.out.println("The animal cries..");
	}
}

class Dog17 extends Animal17 {
	void cry () {
		System.out.println("Woof, Woof..");
	}
}

class Cat17 extends Animal17 {
	void cry () {
		System.out.println("Meows..");
	}
}
public class Cla17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog17 d1 = new Dog17();
		Cat17 c1 = new Cat17();
		
		System.out.println(d1.name);
		System.out.println(c1.name);
		
		d1.cry();
	}

}
