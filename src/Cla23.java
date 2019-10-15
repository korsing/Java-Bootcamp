
class TV23 {
	void powerOn()  { System.out.println("TV - Turn on"); }
	void powerOff() { System.out.println("TV - Turn off"); }
}

class LGTV extends TV23 {
	void powerOn()  { System.out.println("LG TV has been turned ON."); }
	void powerOff() { System.out.println("LG TV has been turned ON."); }
}

class SAMSUNGTV extends TV23 {
	void powerOn()  { System.out.println("SAMSUNG TV has been turned ON."); }
	void powerOff() { System.out.println("SAMSUNG TV has been turned ON."); }
}

class APPLETV extends TV23 {
	void powerOn()  { System.out.println("APPLE TV has been turned ON."); }
	void powerOff() { System.out.println("APPLE TV has been turned OFF."); }
}


public class Cla23 {

	public static void main(String[] args) {
		
		LGTV lg1 = new LGTV();
		SAMSUNGTV samsung1 = new SAMSUNGTV();
		APPLETV apple1 = new APPLETV();
		
		TV23[] tvs = { lg1, samsung1, apple1 };
		
		for ( TV23 a : tvs ) {
			a.powerOn();
			a.powerOff();
			System.out.println();
		}
		

	}

}
