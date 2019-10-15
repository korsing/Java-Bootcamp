import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// 홀짝 프로그램
		// 입력값 : 1
		// 출력값 : 홀수
		System.out.println("숫자입력");
		Scanner sk = new Scanner(System.in);
		int i1 = sk.nextInt();
		if((i1%2)==1) {System.out.println("홀수");}
		else {System.out.println("짝수");}
		sk.close();
	}

}
