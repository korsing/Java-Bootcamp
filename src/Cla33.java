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

class cA33 { // Class ��ü���� �ν��Ͻ��� static�̳� �� ������ �����ϰ�, ���� �����ڴ� �� default�̴�.
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
