
public class For03_Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		for (i=5; i>0; i--) {
			System.out.print(i + ": ");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
