import java.util.Scanner;

public class For05_GugudanInput {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("=== 구구단 시작 ===");
		while(true){
			System.out.println("종료--> 99");
			System.out.println("첫번째 숫자 입력");
			int iEnd = sc.nextInt();
			System.out.println("두번째 숫자 입력");
			int jEnd = sc.nextInt();
			
			if((iEnd==99)||(jEnd==99)) break;
			 for(int i=1;i<=iEnd;i++){
				 for(int j=1;j<=jEnd;j++){
					 System.out.print((i*j)+" "); }
				 System.out.println(); }
		}
		System.out.println("=== 구구단 종료 ===");
		sc.close();
	}
}
