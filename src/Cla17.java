
/*
 * Final 변수 : 변경 금지 (상수화)
 * Final 함수 : 오버로드, 오버라이딩 금지
 * Final 클래스 : 상속 금지
 */

class Animal17 { // object 객체는 자동으로 상속하는 중
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
	
	@Override // 이건 내 메서드가 아니라, 오버라이딩 된 메서드니까 참고해! (임의 변경 시 일부러 컴파일 에러를 만들어줌)
	void cry () { // 이게 바로 메소드 오버라이딩
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
