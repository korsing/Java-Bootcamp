package Automobile;

public class Car {
	// Field
	int tire = 4;
	Tire frontLeft = new Tire("Front Left", 6);
	Tire frontRight = new Tire ("Front Right", 6);
	Tire backLeft = new Tire ("Back Left", 6);
	Tire backRight = new Tire ("Back Righrt", 6);
	
	// Method
	int run() { 
		
		System.out.println("[Car starts to move.. ]");
		
		if(frontLeft.roll() == false) { 
		    	 stop(); 
		    	 return 1; 
		}
		else if(frontRight.roll() == false) { 
			stop(); 
			return 2; 
		}
		else if(backLeft.roll() == false) { 
			stop(); return 3; }
		else if(backRight.roll() == false) { stop(); return 4; }
		     
		return 0; 
		}
	
	void stop() { };
}
