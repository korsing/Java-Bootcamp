
class Wallet01 {
	int money; // Static 변수로 선언을 하게 되면, 전역 변수와 같은 쓰임새가 되는 듯
	void setMoney(int i, int o) {
		money = money + i - o;
		getMoney();
	}
	void getMoney() { System.out.println(money); }
	
}

public class Cla03_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wallet01 m = new Wallet01();
		Wallet01 w = new Wallet01();
		
		m.setMoney(20000, 13000);
		w.setMoney(30000, 11000);
		
	}

}

// 클래스 종류 : 기반 클래스 (메인 함수를 감싸는 것)
// 			  도구형
//           데이터 타입형
