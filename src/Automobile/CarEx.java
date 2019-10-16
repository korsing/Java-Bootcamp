package Automobile;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1:
					System.out.println("Front Left Tire changed to HkTire");
					car.frontLeft = new hkTire("Front Left", 15);
					break;
				case 2:
					System.out.println("Front Right Tire changed to KhTire");
					car.frontRight = new ghTire("Front Right", 13);	
					break;
				case 3:
					System.out.println("Back Left Tire changed to HkTire");
					car.backLeft = new hkTire("Back Left", 14);	
					break;
				case 4:
					System.out.println("Back Right Tire changed to KhTire");
					car.backRight = new ghTire("Back Right", 17);		
					break;
			}
			System.out.println("----------------------------------------");
		}

	}

}
