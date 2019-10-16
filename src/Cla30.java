interface iAni30 {
	             String name = "Animal";
	static final String name2 = "Animal";
	        void shout(); // Abstract method, instance
	default void cry() { System.out.println ("Cries Cries.."); } // Implementation is done on Interface
	 static void run() { System.out.println ("Runs Runs.."); }
}


class Dog30 implements iAni30 {
	public void shout() { System.out.println("Shouts Shouts.."); }
	public void jump() { System.out.println("Jumps Jumps.."); }
}
public class Cla30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(iAni30.name);
		System.out.println(iAni30.name2);
		
		iAni30.run();
	}

}
