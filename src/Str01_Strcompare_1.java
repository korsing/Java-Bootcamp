import java.util.Scanner;

public class Str01_Strcompare_1 {

	public static void main(String[] args) {
		int i = 10, j = 10;
		if ( i == j ) { System.out.println("Same"); }
		else          { System.out.println("Different"); }
		
		String s1 = "SK";
		String s2 = "SK";
		if ( s1 == s2 ) { System.out.println("Same"); }
		else            { System.out.println("Different"); }
		
		Scanner sc = new Scanner(System.in);
		String s3 = sc.next();
		if ( s1 == s3 ) { System.out.println("Same"); }
		else            { System.out.println("Different"); } 
							// Different ��µǴ� ����? : Keyboard �Է����� �־��� �����ʹ� �ӽ÷� ����Ǵ� �޸� ��ġ�� �ٸ���.
							// ��, '=='�� �� ��쿡 �޸� �ּҸ� ���ϴ� �����ڷ� ���� ���� ��ġ�� �ν�
		
		if ( s1.equals(s3) )  { System.out.println("Same"); }
		else            	  { System.out.println("Different"); } 
		
		sc.close(); // �޸� ȣ�� �� ����� ������ �ݵ�� ���Ḧ ���־���Ѵ�.
	}

}
