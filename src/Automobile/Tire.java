package Automobile;

public class Tire {
	// Field
	int maxRotation; // �ִ� ����
	int accRotation; // ���� ����
	String location; // Ÿ�̾� ���� ��ġ
	// Constructor
	Tire (String location, int maxRotation) { // Ÿ�̾� ���� ������ ���� �ʱ� �� ����
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
