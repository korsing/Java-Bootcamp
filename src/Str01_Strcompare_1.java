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
							// Different 출력되는 이유? : Keyboard 입력으로 주어진 테이터는 임시로 저장되는 메모리 위치가 다르다.
							// 즉, '=='는 이 경우에 메모리 주소를 비교하는 연산자로 같지 않은 위치로 인식
		
		if ( s1.equals(s3) )  { System.out.println("Same"); }
		else            	  { System.out.println("Different"); } 
		
		sc.close(); // 메모리 호출 후 사용이 끝나면 반드시 종료를 해주어야한다.
	}

}
