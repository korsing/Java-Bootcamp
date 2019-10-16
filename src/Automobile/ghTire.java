package Automobile;

public class ghTire extends Tire {
	// Constructor
	ghTire (String location, int maxRotation) { // 타이어 관련 변수에 대한 초기 값 설정
		super(location, maxRotation);
	}

	// Method
	boolean roll () { 
		++ accRotation;
		if(accRotation < maxRotation) {
			System.out.println("GeumHo Tire Durability : " + (maxRotation - accRotation));
			return true;
		}
		else {
			System.out.println("GeumHo Tire Down");
			return false;
		}
	}
}
