import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// ����,���������� �Է� �޾Ƽ�
		// ����,����� ���Ͻÿ�
		// 1) ����� 90 �̻� ���, 80 �̻� ����, 70 �̻� �̺�, 70�̸� ����
		// 2) ����� 60�� �̸��� ������ ������
		Scanner sc = new Scanner(System.in);
		System.out.println("����������?");
		int iKr = sc.nextInt(); 
		System.out.println("����������?");
		int iEn = sc.nextInt();
		
		int iTotal = iKr + iEn; 
		int iAvg = iTotal/2 ;
		System.out.println("��� : "+ iAvg);
		
		if((iKr< 60) || (iEn < 60)) {
			System.out.println("���� ����"); 	}
		else {
			if(iAvg>=90){System.out.println("���");}
			else if(iAvg>=80){System.out.println("����");}
			else if(iAvg>=70){System.out.println("�̺�");}
			else {System.out.println("��� ����");}
		}
		sc.close();
	}

}
