import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// 국어,영어점수를 입력 받아서
		// 총점,평균을 구하시오
		// 1) 평균이 90 이상 우수, 80 이상 보통, 70 이상 미비, 70미만 낙제
		// 2) 과목당 60점 미만이 있으면 과목낙제
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수는?");
		int iKr = sc.nextInt(); 
		System.out.println("영어점수는?");
		int iEn = sc.nextInt();
		
		int iTotal = iKr + iEn; 
		int iAvg = iTotal/2 ;
		System.out.println("평균 : "+ iAvg);
		
		if((iKr< 60) || (iEn < 60)) {
			System.out.println("과목 낙제"); 	}
		else {
			if(iAvg>=90){System.out.println("우수");}
			else if(iAvg>=80){System.out.println("보통");}
			else if(iAvg>=70){System.out.println("미비");}
			else {System.out.println("평균 낙제");}
		}
		sc.close();
	}

}
