
/*
 * Final ���� : ���� ���� (���ȭ)
 * Final �Լ� : �����ε�, �������̵� ����
 * Final Ŭ���� : ��� ����
 */

class Animal17 { // object ��ü�� �ڵ����� ����ϴ� ��
	String name = "Animal's Name";
	int age;
	Animal17() { System.out.println("This is Animal17's Constructor.."); }
	Animal17(String name) { 
		name = this.name;
		System.out.println("The animal's name is " + name + "."); 
	}
	
	void cry () {
		System.out.println("The animal cries..");
	}
}

class Dog17 extends Animal17 {
	Dog17() { System.out.println("This is Dog17 Constructor.."); }
	Dog17(String name) {
		//super(name);
		System.out.println("The dog's name is " + name + ".");
	}
	
	@Override // �̰� �� �޼��尡 �ƴ϶�, �������̵� �� �޼���ϱ� ������! (���� ���� �� �Ϻη� ������ ������ �������)
	void cry () { // �̰� �ٷ� �޼ҵ� �������̵�
		System.out.println("Woof, Woof..");
	}
}

class Cat17 extends Animal17 {
	Cat17() { System.out.println("This is Cat17 Constructor.."); }
	
	@Override
	void cry () {
		System.out.println("Meows..");
	}
}
public class Cla17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog17 d1 = new Dog17("Morangi");
//		Cat17 c1 = new Cat17();
//		
//		System.out.println(d1.name);
//		System.out.println(c1.name);
//		
//		d1.cry();
	}

}
