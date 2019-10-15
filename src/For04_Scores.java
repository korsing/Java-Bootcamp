import java.util.Scanner;

public class For04_Scores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean = 0, english = 0;
		double average = 0;
		
		while(true) {
			System.out.print("Korean : ");
			korean = sc.nextInt();
			System.out.print("English : ");
			english = sc.nextInt();
			
			average = (korean + english)/2;
			
			if(korean < 60 || english < 60) {
				System.out.println("Subject Fail");
			}
			else {
				if(average >= 90) 		{ System.out.println("Outstanding"); }
				else if (average >= 80) { System.out.println("Just above the Norms"); }
				else if (average >= 70) { System.out.println("Not Bad"); }
				else 					{ System.out.println("Average Fail"); }
			}
		}
	}
}
