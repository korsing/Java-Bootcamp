
public class Quiz03 {

	public static void main(String[] args) {
		// 1 ~ 100 ������ ���ι������� ����ϼ���
		//3,6,9�϶��� '¦¦' �̶�� ����ϼ���
		for (int i = 1; i<=100; i++) {
			String temp = Integer.toString(i);
			if (temp.contains("3") || temp.contains("6") || temp.contains("9")) {
				System.out.println ("Clap");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
