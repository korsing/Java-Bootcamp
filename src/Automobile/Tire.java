package Automobile;

public class Tire {
	// Field
	int maxRotation; // 최대 수명
	int accRotation; // 현재 수명
	String location; // 타이어 장착 위치
	// Constructor
	Tire (String location, int maxRotation) { // 타이어 관련 변수에 대한 초기 값 설정
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// Method
	boolean roll () { 
		++ accRotation;
		if(accRotation < maxRotation) {
			System.out.println("Tire Durability : " + (maxRotation - accRotation));
			return true;
		}
		else {
			System.out.println("Tire Down");
			return false;
		}
	}
}
