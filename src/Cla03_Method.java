
class Wallet01 {
	int money; // Static ������ ������ �ϰ� �Ǹ�, ���� ������ ���� ���ӻ��� �Ǵ� ��
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

// Ŭ���� ���� : ��� Ŭ���� (���� �Լ��� ���δ� ��)
// 			  ������
//           ������ Ÿ����
