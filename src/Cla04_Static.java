
class Calc04 {
	// ���� �񽺹Ǹ��� ��
	void sum (int i, int j) { 
		System.out.println( i+j ); 
		// return; Void���̶�� ���� ���� ���� ���� �ƴϴ�.
	}
	static void sub (int i, int j) { // �Լ��� static�� �ٿ��� -> 
		System.out.println( i-j ); 
	}
}

public class Cla04_Static {
	
	// ���� �񽺹Ǹ��� ��
	void mul (int i, int j) { 
		System.out.println( i*j ); 
		// return; Void���̶�� ���� ���� ���� ���� �ƴϴ�.
	}
	static void div (int i, int j) { // �Լ��� static�� �ٿ���
		System.out.println( i/j ); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;
		
		Calc04 c1 = new Calc04(); 
		
		c1.sum(a, b);
		Calc04.sub(a, b);
		
		Cla04_Static c2 = new Cla04_Static(); // �Ϲ����� ��ü�� �ʿ��� ������ �ؾ�� ���� ��
		c2.mul(a, b);           // Static ��ü�� ���� �ϳ� �ھƵΰ�, ����ͼ� ���
		c2.div(a, b);
	}

}
