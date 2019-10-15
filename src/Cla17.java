
/*
 * Final 변수 : 변경 금지 (상수화)
 * Final 함수 : 오버로드, 오버라이딩 금지
 * Final 클래스 : 상속 금지
 */

class Animal17 { // object 객체는 자동으로 상속하는 중
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
