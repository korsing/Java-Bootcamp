import java.util.Scanner;

public class For05_GugudanInput {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("=== ������ ���� ===");
		while(true){
			System.out.println("����--> 99");
			System.out.println("ù��° ���� �Է�");
			int iEnd = sc.nextInt();
			System.out.println("�ι�° ���� �Է�");
			int jEnd = sc.nextInt();
			
			if((iEnd==99)||(jEnd==99)) break;
			 for(int i=1;i<=iEnd;i++){
				 for(int j=1;j<=jEnd;j++){
					 System.out.print((i*j)+" "); }
				 System.out.println(); }
		}
		System.out.println("=== ������ ���� ===");
		sc.close();
	}
}
