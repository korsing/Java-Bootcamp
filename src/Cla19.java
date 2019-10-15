class Ani19 {
	String name = "Animal";
	Ani19() { System.out.println(this.name); }
}

class Dog19 extends Ani19 {
	Dog19() { super(); }
	String name = "Dog";
}

public class Cla19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog19 d1 = new Dog19();
		System.out.println (d1.name);
	}

}
