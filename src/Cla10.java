class A10 {
	int aa1 = 10;            // Default : ���� ��Ű��
	public int aa2 = 100;    // Public : �׻� ����
	private int aa3 = 100;   // Private : ���� A10 Ŭ���� ���ο����� ���
	protected int aa4 = 100; // Protected : ��� ���� Ŭ���������� ����
	
	A10() { System.out.println ("A10 Constructor Call.."); }
	// B10���� A10�� ��ӹ޾ư��� �����ڴ� �ڵ����� ȣ���� �ȴ�.
}

class B10 extends A10 {
	int bb1 = 20;
	B10() { System.out.println ("B10 Constructor Call.."); }
}

public class Cla10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B10 b1 = new B10();
		System.out.println(b1.aa1); // �θ� Ŭ�������� ����� ������ ȣ���� ������.
	}

}
