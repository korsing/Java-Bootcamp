import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, h, m, s;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter time in seconds. : ");
		s = sc.nextInt();
		
		// 1분 : 60초, 1시간 : 3600초, 
		
		h = s / 3600;
		s = s-(h*3600);
		
		m = s / 60;
		s = s-(m*60);
		
		System.out.println("The time is "+ h + " hour, " + m + " minute and " + s + " second.");
		
	}

}
