class Sing16 {
	private static Sing16 sing = new Sing16();
	private Sing16() {} // �����ڸ� ���ҰŴϱ�, ��ȸ�����ڸ� ����������
	static Sing16 getInstance() { // �� ģ���� ��ȸ
		return sing;
	}
}
public class Cla16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� Ŭ���� ���� ��ü�� ����ó�� ���� ������ ���� �ν��Ͻ��� ���°ǵ� (�����ڰ� ��� ����Ǵϱ� �߻� -> �����ڸ� Block�ϸ� �ȴ�)
        // ���� �� �ϳ��� �ν��Ͻ��� ������ �ǵ��� �ϰ� �ʹٸ�? [Singleton]
//		Sing16 s1 = new Sing16(); 
//		Sing16 s2 = new Sing16(); 
		
		Sing16 s1 = Sing16.getInstance();
		Sing16 s2 = Sing16.getInstance();
		
		System.out.println(s1 == s2);

	}

}
