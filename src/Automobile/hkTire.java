package Automobile;

public class hkTire extends Tire {
	// Constructor
	hkTire (String location, int maxRotation) { // 타이어 관련 변수에 대한 초기 값 설정
		super(location, maxRotation);
	}

	// Method
	boolean roll () { 
		++ accRotation;
		if(accRotation < maxRotation) {
			System.out.println("HanKook Tire Durability : " + (maxRotation - accRotation));
			return true;
		}
		else {
			System.out.println("HanKook Tire Down");
			return false;
		}
	}
}
