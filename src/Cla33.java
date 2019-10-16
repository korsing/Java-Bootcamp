interface iA33 {
	
}

abstract class abA33 { 
	       String abName;                                             // Default Instance Field 
	static String abName2;                                            // Default Static Field
	       void abCry()   { System.out.println("Cries Cries.."); }    // Default Instance Method
	static void abShout() { System.out.println("Shouts Shouts.."); }  // Default Static Method	
	
	         void Run() { System.out.println("Runs Runs.."); }        // Default Instance Method
	abstract void cRun();                                             // Default Abstract Method : To be Implemented below somewhere
}

class cA33 { // Class 자체에는 인스턴스나 static이나 다 구현이 가능하고, 접근 제한자는 다 default이다.
	       String cName;                                             // Default Instance Field 
	static String cName2;                                            // Default Static Field
	       void cCry()   { System.out.println("Cries Cries.."); }    // Default Instance Method
	static void cShout() { System.out.println("Shouts Shouts.."); }  // Default Static Method
	
	// abstract static void cRun() { System.out.println("Runs Runs.."); } Cannot be used in this way
}

public class Cla33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
