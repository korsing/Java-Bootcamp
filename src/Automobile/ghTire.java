package Automobile;

public class ghTire extends Tire {
	// Constructor
	ghTire (String location, int maxRotation) { // Ÿ�̾� ���� ������ ���� �ʱ� �� ����
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
