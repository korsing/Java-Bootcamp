import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// Ȧ¦ ���α׷�
		// �Է°� : 1
		// ��°� : Ȧ��
		System.out.println("�����Է�");
		Scanner sk = new Scanner(System.in);
		int i1 = sk.nextInt();
		if((i1%2)==1) {System.out.println("Ȧ��");}
		else {System.out.println("¦��");}
		sk.close();
	}

}
