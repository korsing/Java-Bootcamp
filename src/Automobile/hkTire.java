package Automobile;

public class hkTire extends Tire {
	// Constructor
	hkTire (String location, int maxRotation) { // Ÿ�̾� ���� ������ ���� �ʱ� �� ����
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
