import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		//3) * 정사각형 만들기
		//입력 예: 3
		//출력 예: ***
		//      ***
		//      ***
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number. : ");
		int size = sc.nextInt();
		
		for (int i = 0; i<size; i++) {
			for (int j = 0; j<size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
