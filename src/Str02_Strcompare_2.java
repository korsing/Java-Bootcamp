
public class Str02_Strcompare_2 {
	public static void main(String[] args) {
		String s1 = "SK";
		String s2 = "SK";
		if(s1==s2){System.out.println("����");}
		else{System.out.println("�ٸ�");} 
		
		String s3 = new String("SK");
		if(s1==s3){System.out.println("����");}
		else{System.out.println("�ٸ�");}
		
		String s4 = new String(s1);
		if(s1==s4){System.out.println("����");}
		else{System.out.println("�ٸ�");}
		
		String s5 = s1;
		if("SK"==s5){System.out.println("����");}
		else{System.out.println("�ٸ�");}
		
		// �ٽ��� '=='�� �ּҺ�, 'equals()'�� �� ��!
	}
}
