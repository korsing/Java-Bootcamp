
class Com14 {
	
	static String company;
	static String dept;
	static String info;
		   String part;
	
	static { // Static �ʱ�ȭ ���� 
		// Static�̴� ������ ȣ��� �� �޸𸮿� �ε���ٵ�, ���ǹ�, �ݺ����� ����� ���� �ִ�.
		// ������, �� ó�� �ʱ�ȭ�� �ϱ� ���� �ڵ��, ���� �Լ����� company, dept �־��൵ info�� �ٲ��� �ʴ´�.
		info = company + " " + dept; 
		
		// part = "A Part"; // Static�� �ƴ� ������ �� �� �ȿ� ���� �� ����.
		
	}
	static int Sum (int x, int y) { return x+y; }
}

public class Cla14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Com14.company = "SK Hynix";
		System.out.println(Com14.company); // Static Variable ���� ������ �� Ȯ��
		
		System.out.println(Com14.Sum(10,20));
		
		Com14.company = "SK Hynix";
		Com14.dept = "IM";
		
		System.out.println(Com14.info);
		
	}

}
